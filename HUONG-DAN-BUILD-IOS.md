# Build iOS bằng GitHub Actions

Dự án: libGDX `VDTTGDX` — backend iOS dùng **RoboVM 2.3.20**, Gradle wrapper 8.13, JDK 11.

Vì RoboVM cần Xcode (chỉ chạy trên macOS), cách chuẩn để build iOS trên GitHub là
dùng **GitHub-hosted macOS runner** (`macos-14`) rồi gọi task `ios:createIPA`.

Workflow đã được tạo sẵn: [.github/workflows/ios-build.yml](.github/workflows/ios-build.yml)

---

## 1. Đẩy code lên GitHub

Thư mục hiện tại chưa phải Git repo. Từ thư mục gốc:

```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/<user>/<repo>.git
git push -u origin main
```

> Kiểm tra `git status` trước khi `git add .` để chắc chắn **không** commit
> `Client/local.properties` (đường dẫn SDK máy bạn), `game.jks`, hay các thư mục `build/`.
> Các file này đã được thêm vào [Client/.gitignore](Client/.gitignore).

Sau khi push, workflow chạy tự động khi push lên `main`/`master`, hoặc bấm tay ở
tab **Actions → Build iOS → Run workflow** (`workflow_dispatch`).

---

## 2. Chạy workflow không cần ký (kiểm tra nhanh)

Nếu chưa có chứng chỉ Apple, cứ chạy workflow. Nó sẽ build **IPA không ký**
(`-PiosSkipSigning=true`) để xác nhận code + RoboVM + Xcode biên dịch được.
Artifact tải về **không cài được lên máy thật** (chỉ để kiểm tra build).

---

## 3. Cài lên máy thật / TestFlight (cần chứng chỉ)

Vào **Settings → Secrets and variables → Actions → New repository secret** và tạo:

| Secret | Mô tả |
| --- | --- |
| `IOS_CERT_P12_BASE64` | File `.p12` (cert Distribution/Development) đã mã hoá base64 |
| `IOS_CERT_PASSWORD` | Mật khẩu của file `.p12` |
| `IOS_PROVISIONING_PROFILE_BASE64` | File `.mobileprovision` đã mã hoá base64 |
| `IOS_SIGN_IDENTITY` | Tên định danh ký, ví dụ `Apple Distribution: Cong ty ABC (TEAMID)` |
| `IOS_PROVISIONING_PROFILE` | Tên (Name) của provisioning profile, ví dụ `VDTTGDX AppStore` |
| `KEYCHAIN_PASSWORD` | Mật khẩu bất kỳ, chỉ dùng cho keychain tạm trên runner |

Tạo chuỗi base64 (macOS/Linux):

```bash
base64 -i cert.p12 | pbcopy              # macOS
base64 -w0 cert.p12 > cert.p12.b64       # Linux
base64 -i profile.mobileprovision | pbcopy
```

Khi đã có `IOS_CERT_P12_BASE64`, workflow tự import vào keychain tạm và copy profile
vào `~/Library/MobileDevice/Provisioning Profiles` (đường dẫn mà RoboVM 2.3.20 đọc được).

---

## 4. Lấy kết quả

Vào **Actions → chọn lần chạy → Artifacts → `ios-ipa`**. Trong đó có:

```
Client/ios/build/robovm/*.ipa
```

---

## 5. Lưu ý tương thích (quan trọng)

- **Ghim Xcode.** Workflow chọn `Xcode_15.4` trên `macos-14`. RoboVM 2.3.20 ổn định với
  Xcode 15.x; Xcode 16 đổi vị trí lưu provisioning profile và có thể làm RoboVM không
  tìm thấy profile (`macos-latest` có thể nhảy lên macOS 15 / Xcode 16 → tránh).
- **Cờ linker `-ld_classic`.** Đã thêm vào [Client/ios/robovm.xml](Client/ios/robovm.xml)
  để tránh lỗi `compact unwind compressed function offset doesn't fit in 24 bits`
  trên Xcode 15 (thẻ `<tools><linker><flags><flag>`, cần RoboVM ≥ 2.3.20).
- **Cần Android SDK.** `settings.gradle` include cả module `android`, nên Gradle cần SDK
  khi cấu hình — workflow tạo `Client/local.properties` từ `ANDROID_HOME` của runner.

Nếu sau này nâng cấp được RoboVM lên bản có fix Xcode 16 (PR #797), có thể bỏ ghim Xcode
và bỏ `-ld_classic`.

---

## 6. Build iOS ngay trên máy Mac (nếu có)

```bash
cd Client
./gradlew ios:createIPA                      # build + ký
./gradlew ios:launchIPhoneSimulator          # chạy trên simulator iPhone
```

Credential không nên hard-code — truyền qua `-P`:

```bash
./gradlew ios:createIPA \
  -PiosSignIdentity="Apple Distribution: Cong ty ABC (TEAMID)" \
  -PiosProvisioningProfile="VDTTGDX AppStore"
```

---

## Tóm tắt thay đổi trong repo

| File | Thay đổi |
| --- | --- |
| [.github/workflows/ios-build.yml](.github/workflows/ios-build.yml) | Workflow Actions build IPA (macOS, JDK 11, Xcode 15.4) |
| [Client/ios/robovm.xml](Client/ios/robovm.xml) | Thêm cờ linker `-ld_classic` cho Xcode 15 |
| [Client/ios/build.gradle](Client/ios/build.gradle) | Nhận `iosSignIdentity` / `iosProvisioningProfile` / `iosSkipSigning` qua `-P` |
| [Client/.gitignore](Client/.gitignore) | Bỏ qua keystore/cert/profile |
