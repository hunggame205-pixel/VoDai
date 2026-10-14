import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageEncryptDecrypt {
    private File selectedFolder;

    public static void main(String[] args) {
        ImageEncryptDecrypt app = new ImageEncryptDecrypt();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nImage Encrypt/Decrypt Application");
            System.out.println("1. Select Folder");
            System.out.println("2. Encrypt Images");
            System.out.println("3. Decrypt Images");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    selectFolder(scanner);
                    break;
                case "2":
                    if (selectedFolder != null) {
                        processImages(true);
                    } else {
                        System.out.println("Please select a folder first!");
                    }
                    break;
                case "3":
                    if (selectedFolder != null) {
                        processImages(false);
                    } else {
                        System.out.println("Please select a folder first!");
                    }
                    break;
                case "4":
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void selectFolder(Scanner scanner) {
        System.out.print("Enter the path of the folder: ");
        String folderPath = scanner.nextLine();
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            selectedFolder = folder;
            System.out.println("Selected folder: " + selectedFolder.getAbsolutePath());
        } else {
            System.out.println("Invalid folder path. Please try again.");
        }
    }

    private void processImages(boolean isEncrypt) {
        List<File> imageFiles = new ArrayList<>();
        findImageFiles(selectedFolder.toPath(), imageFiles);
        if (imageFiles.isEmpty()) {
            System.out.println("No image files found in the folder.");
        } else {
            String operation = isEncrypt ? "Encrypting" : "Decrypting";
            System.out.println(operation + " images...");

            for (File file : imageFiles) {
                try {
                    byte[] fileBytes = Files.readAllBytes(file.toPath());
                    byte[] processedBytes = encry(fileBytes);
                    Files.write(file.toPath(), processedBytes);
                } catch (IOException e) {
                    System.out.println("Error processing file: " + file.getName());
                    e.printStackTrace();
                }
            }
            System.out.println(operation + " completed!");
        }
    }

    private void findImageFiles(Path path, List<File> imageFiles) {
        File folder = path.toFile();
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findImageFiles(file.toPath(), imageFiles);
                } else if (file.isFile() && (file.getName().toLowerCase().endsWith(".png") || file.getName().toLowerCase().endsWith(".jpg"))) {
                    imageFiles.add(file);
                }
            }
        }
    }

    private byte[] encry(byte[] var0) {
        try {
            if (var0 != null) {
                int var1;
                if ((var1 = var0.length) <= 320) {
                    byte[] var2 = new byte[var1];
                    for (int var3 = 0; var3 < var1; ++var3) {
                        var2[var1 - 1 - var3] = var0[var3];
                    }
                    System.arraycopy(var2, 0, var0, 0, var1);
                } else {
                    int var9 = var1;
                    byte[] var8 = var0;
                    byte[] var10 = new byte[]{-116, -105, 79, -108, -39, -88, -61, -93, -91, 5, 83, 66, -113, 100, 64, 81, -115, 54, -50, 52, 76, 4, 85, 107, 70, 53, 4, -109, 77, 42, 85, -24, -109, 23, 43, -59, 60, 78, 25, 26, 27, 25, -20, -55, -70, 83, 56, -19, -107, -77, 81, -57, -27, -10, -64, -74, 106, -55, 117, 34, 66, -112, 43, 38, 54, -90, -89, -25, 100, -79, -38, -107, -9, 49, 86, -114, 98, 101, -35, 25, -52, 41, 117, 37, 116, 32, 72, -113, 86, 90, 88, -22, -42, 19, 32, -2, -39, -56, -43, -97, -44, 70, -21, 73, -68, -47, 116, 85, -84, -98, 51, 75, -12, -67, -81, 52, -34, -42, 115, 10, 93, -65, -46, 14, -50, -57, 56, -106, -111, 50, 107, -47, -48, -14, -96, -88, 109, -34, -6, 83, -101, 1, -98, 85, -45, 2, -46, 6, -89, 76, -13, -117, -110, -55, -10, -61, -114, -96, -58, -64, 112};
                    for (int var5 = 0; var5 < 160; ++var5) {
                        byte var4 = var8[var5];
                        var8[var5] = (byte) (var8[var9 - 160 + var5] + var10[var5]);
                        var8[var9 - 160 + var5] = (byte) (var4 - var10[var5]);
                    }
                    for (int var5 = 160; var5 < var9 - 160; ++var5) {
                        var8[var5] = (byte) (-var8[var5]);
                    }
                    var0 = var8;
                }
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }
        return var0;
    }
}