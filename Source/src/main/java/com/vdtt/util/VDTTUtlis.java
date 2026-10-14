package com.vdtt.util;

import com.vdtt.item.Item;
import com.vdtt.item.ItemOption;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Entity;
import com.vdtt.model.XYEntity;
import com.vdtt.server.Config;

import java.io.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class VDTTUtlis {
    private static final Random rand = new Random();
    private static final NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi"));
    private static final DateFormat dateFormatWeek = new SimpleDateFormat("yyyy-MM-ww");

    public static int nextInt(int max) {
        return rand.nextInt(max);
    }

    public static void logText(String path, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(text);
            writer.newLine(); // Thêm dòng mới
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writing(String path, String text) {
        PrintWriter printWriter = null;
        File file = new File(path);
        try {
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs();
            }
            if (!file.exists())
                file.createNewFile();
            printWriter = new PrintWriter(new FileOutputStream(path, true));
            printWriter.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
            }
        }
    }

    public static long sum(long... numbers) {
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static byte[] inflateByteArray(byte[] var0) {
        Inflater var2;
        (var2 = new Inflater()).setInput(var0);
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        byte[] var3 = new byte[4096];

        try {
            while (!var2.finished()) {
                int var4 = var2.inflate(var3);
                var1.write(var3, 0, var4);
            }

            byte[] var13 = var1.toByteArray();
            return var13;
        } catch (Exception var11) {
        } finally {
            try {
                var1.close();
            } catch (Exception var10) {
            }

        }

        return var0;
    }

    public static void sleep(long paramLong) {
        try {
            Thread.sleep(paramLong);
        } catch (Exception exception) {
        }
    }

    public static int[] getXYFake(int var1, int var2, int J) {
        int var3 = J / 255;
        if (J % 255 != 0) {
            ++var3;
        }
        int byte1 = var2 / 255 * var3 + var1 / 255;
        int byte2 = var1 % 255;
        int byte3 = var2 % 255;
        return new int[]{byte1, byte2, byte3};
    }

    public static int[] getXYReal(int byte1, int byte2, int byte3, int aj) {
        int var3 = aj / 255;
        if (aj % 255 != 0) {
            ++var3;
        }

        int n1 = byte1 % var3;  // Phần của var1/255
        int n2 = byte1 / var3;  // Phần của var2/255

        return new int[]{
                byte2 + (255 * n1),  // var1 = 207 + (255 * 2) = 717
                byte3 + (255 * n2)   // var2 = 49 + (255 * 1) = 304
        };
    }

    public static byte[] deflateByteArray(byte[] var0) {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        Deflater var4;
        (var4 = new Deflater()).setLevel(9);
        var4.setInput(var0);
        var4.finish();
        byte[] var5 = new byte[4096];

        while (!var4.finished()) {
            var2.write(var5, 0, var4.deflate(var5));
        }

        var4.end();
        return var2.toByteArray();
    }

    public static byte[] c(byte[] var0) {
        Inflater var2;
        (var2 = new Inflater()).setInput(var0);
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        byte[] var3 = new byte[4096];

        try {
            while (!var2.finished()) {
                int var4 = var2.inflate(var3);
                var1.write(var3, 0, var4);
            }

            byte[] var13 = var1.toByteArray();
            return var13;
        } catch (Exception var11) {
        } finally {
            try {
                var1.close();
            } catch (Exception var10) {
            }

        }

        return var0;
    }

    public static byte[] getFile(String url) {
        try {
            FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir"), url));
            byte[] ab = new byte[fis.available()];
            fis.read(ab, 0, ab.length);
            fis.close();
            return ab;
        } catch (IOException ex) {

        }
        return null;
    }

    public static byte[] read(String paramString) {
        FileInputStream fileInputStream = null;
        try {
            File file;
            if (!(file = new File(paramString)).exists()) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            byte[] arrayOfByte = new byte[(int) file.length()];
            fileInputStream.read(arrayOfByte, 0, arrayOfByte.length);
            arrayOfByte = arrayOfByte;
            return arrayOfByte;
        } catch (Exception exception) {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception exception1) {
            }
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception exception) {
            }
        }
        return null;
    }

    public static String timeAgo(int seconds) {
        int minutes = seconds / 60;
        if (minutes > 0) {
            return minutes + " phút";
        } else {
            return seconds + " giây";
        }
    }

    public static int getRange(Entity entity1, Entity entity2) {
        return getRange(entity1.x, entity1.y, entity2.x, entity2.y);
    }

    public static int getRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        paramInt1 = getRange(paramInt1 - paramInt3);
        paramInt2 = getRange(paramInt2 - paramInt4);
        return (paramInt1 > paramInt2) ? paramInt1 : paramInt2;
    }

    public static int getRange(int paramInt) {
        return (paramInt > 0) ? paramInt : -paramInt;
    }

    public static byte randomZoneId(int mapId) {
        Map map = MapManager.getInstance().find(mapId);
        List<Zone> zones = map.getZones();
        if (zones.isEmpty()) {
            return -1;
        }
        byte zoneId = 0;
        for (Zone zone : zones) {
            if (zone.getNumberChar() >= 24) {
                zoneId++;
            } else {
                break;
            }
        }
        int size = zones.size();
        if (zoneId < 0 || zoneId >= size) {
            zoneId = (byte) VDTTUtlis.nextInt(size);
        }
        return zoneId;
    }

    public static String[] split(String paramString1, String paramString2) {
        Vector<String> vector = new Vector();
        for (int i = paramString1.indexOf(paramString2); i >= 0; i = (paramString1 = paramString1.substring(i + paramString2.length())).indexOf(paramString2)) {
            vector.addElement(paramString1.substring(0, i));
        }
        vector.addElement(paramString1);
        String[] arrayOfString = new String[vector.size()];
        vector.copyInto((Object[]) arrayOfString);
        return arrayOfString;
    }

    public static String[] a(String var0, String var1) {
        Vector var2 = new Vector();

        for (int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
            var2.addElement(var0.substring(0, var3));
        }

        var2.addElement(var0);
        String[] var4 = new String[var2.size()];
        var2.copyInto(var4);
        return var4;
    }

    public static XYEntity a(XYEntity var0, XYEntity var1, XYEntity var2, XYEntity var3) {
        double var9 = (double) var0.x;
        double var11 = (double) var1.x;
        double var13 = (double) var2.x;
        double var15 = (double) var3.x;
        double var17 = (double) var0.y;
        double var19 = (double) var1.y;
        double var21 = (double) var2.y;
        double var23 = (double) var3.y;
        XYEntity var10000;
        double var25;
        if ((var25 = (var9 - var11) * (var21 - var23) - (var17 - var19) * (var13 - var15)) == 0.0D) {
            var10000 = null;
        } else {
            double var27 = ((var13 - var15) * (var9 * var19 - var17 * var11) - (var9 - var11) * (var13 * var23 - var21 * var15)) / var25;
            double var29 = ((var21 - var23) * (var9 * var19 - var17 * var11) - (var17 - var19) * (var13 * var23 - var21 * var15)) / var25;
            var10000 = XYEntity.create((int) var27, (int) var29);
        }

        XYEntity var4 = var10000;
        return var10000 != null && a(var4.x, var4.y, var0, var1) && a(var4.x, var4.y, var2, var3) ? var4 : null;
    }

    private static boolean a(int var0, int var1, XYEntity var2, XYEntity var3) {
        return (var3.x > var2.x && var2.x <= var0 && var0 <= var3.x || var2.x >= var3.x && var2.x >= var0 && var0 >= var3.x) && (var3.y > var2.y && var2.y <= var1 && var1 <= var3.y || var2.y >= var3.y && var2.y >= var1 && var1 >= var3.y);
    }


    public static int b(int var0) {
        return var0 > 0 ? var0 : -var0;
    }

    public static Random c = new Random();


    public static int nextInt(int paramInt1, int paramInt2) {
        return (paramInt2 == paramInt1 && paramInt2 == 0) ? 0 : (paramInt1 + nextInt(paramInt2 - paramInt1 + 1));
    }

    public static boolean nextInt() {
        return !(c.nextInt(2) == 0);
    }

    public static int nextInt(int[] paramArrayOfint) {
        return paramArrayOfint[nextInt(3)];
    }


    public static Entity a(Entity var0, Entity var1, Entity var2, Entity var3) {
        Entity var4;
        return (var4 = b(var0, var1, var2, var3)) != null && a(var4.x, var4.y, var0, var1) && a(var4.x, var4.y, var2, var3) ? var4 : null;
    }

    private static boolean a(int var0, int var1, Entity var2, Entity var3) {
        return (var3.x > var2.x && var2.x <= var0 && var0 <= var3.x || var2.x >= var3.x && var2.x >= var0 && var0 >= var3.x) && (var3.y > var2.y && var2.y <= var1 && var1 <= var3.y || var2.y >= var3.y && var2.y >= var1 && var1 >= var3.y);
    }

    private static Entity b(Entity var0, Entity var1, Entity var2, Entity var3) {
        double var4 = (double) var0.x;
        double var6 = (double) var1.x;
        double var8 = (double) var2.x;
        double var10 = (double) var3.x;
        double var12 = (double) var0.y;
        double var14 = (double) var1.y;
        double var16 = (double) var2.y;
        double var18 = (double) var3.y;
        double var20;
        if ((var20 = (var4 - var6) * (var16 - var18) - (var12 - var14) * (var8 - var10)) == 0.0D) {
            return null;
        } else {
            double var22 = ((var8 - var10) * (var4 * var14 - var12 * var6) - (var4 - var6) * (var8 * var18 - var16 * var10)) / var20;
            double var24 = ((var16 - var18) * (var4 * var14 - var12 * var6) - (var12 - var14) * (var8 * var18 - var16 * var10)) / var20;
            return Entity.create((int) var22, (int) var24);
        }
    }

    public static int getRange(int paramInt1, int paramInt2) {
        return getRange(paramInt1 - paramInt2);
    }


    private static double getRange(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
        return Math.sqrt(Math.abs((paramDouble1 - paramDouble3) * (paramDouble1 - paramDouble3)) + Math.abs((paramDouble2 - paramDouble4) * (paramDouble2 - paramDouble4)));
    }

    public static String formatMoney(String paramString) {
        try {
            Long.parseLong(paramString);
        } catch (Exception exception) {
            return paramString;
        }
        String str1 = "";
        String str2 = "";
        if (paramString.charAt(0) == '-') {
            str2 = "-";
            paramString = paramString.substring(1);
        }
        for (int i = paramString.length() - 1; i >= 0; i--) {
            if ((paramString.length() - 1 - i) % 3 == 0 && paramString.length() - 1 - i > 0) {
                str1 = paramString.charAt(i) + "." + str1;
            } else {
                str1 = paramString.charAt(i) + str1;
            }
        }
        return str2 + str1;
    }

    public static String formatMoney(long paramLong) {
        return formatMoney(String.valueOf(paramLong));
    }

    public static String formatMoney(int paramInt) {
        return formatMoney(String.valueOf(paramInt));
    }


    public static String replace(String paramString1, String paramString2) {
        return paramString1.replaceAll("#", paramString2);
    }

    public static String replace(String paramString, long paramLong) {
        return paramString.replaceAll("#", String.valueOf(paramLong));
    }

    public static String nextUTF(int paramInt) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder(paramInt);
        for (byte b = 0; b < paramInt; b++) {
            stringBuilder.append(str.charAt(nextInt(str.length())));
        }
        return stringBuilder.toString();
    }

    public static byte[] inflateByteArray2(byte[] var0) {
        Inflater var2;
        (var2 = new Inflater()).setInput(var0);
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        byte[] var3 = new byte[4096];

        try {
            while (!var2.finished()) {
                int var4 = var2.inflate(var3);
                var1.write(var3, 0, var4);
            }

            byte[] var13 = var1.toByteArray();
            return var13;
        } catch (Exception var11) {
        } finally {
            try {
                var1.close();
            } catch (Exception var10) {
            }

        }

        return var0;
    }


    public static void write(String paramString, byte[] paramArrayOfbyte) {
        try {
            FileOutputStream fileOutputStream;
            (fileOutputStream = new FileOutputStream(paramString)).write(paramArrayOfbyte);
            fileOutputStream.close();
            return;
        } catch (Exception exception) {
            return;
        } finally {
        }
    }

    public static int readLength(String paramString) {
        byte[] arrayOfByte;
        return ((arrayOfByte = read(paramString)) != null) ? arrayOfByte.length : 0;
    }


    public static String j(int var0) {
        return var0 % 1000 == 0 ? formatMoney(String.valueOf(var0 /= 1000)) : "" + (float) var0 / 1000.0F;
    }


    public static String valueOf(String[] arrayText, String string) {
        String str = "";
        for (int i = 0; i < arrayText.length; i++) {
            str += arrayText[i];
            if (i < arrayText.length - 1) {
                str += string;
            }
        }
        return str;
    }

//    public static int getIntItemOption(ItemOption[] arrayItemOption, int id) {
//        if (arrayItemOption == null) {
//            return 0;
//        }
//        for (int i = 0; i < arrayItemOption.length; i++) {
//            if (arrayItemOption[i].b[0] == id) {
//                return arrayItemOption[i].b[1];
//            }
//        }
//        return 0;
//
//    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static ArrayList<Item> cleanArrayItem(Item[] array) {
        ArrayList<Item> item = new ArrayList<Item>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                item.add(array[i]);
            }
        }

        return item;
    }

    public static String b(String var0, String var1) {
        return var0.replaceAll("#", var1);
    }

    public static String c(int var0) {
        return c(String.valueOf(var0));
    }

    public static int a(int var0) {
        return var0 <= 0 ? 0 : rand.nextInt(var0);
    }

    public static String c(long var0) {
        return c(String.valueOf(var0));
    }

    public static String c(String var0) {
        try {
            Long.parseLong(var0);
        } catch (Exception var4) {
            return var0;
        }

        String var1 = "";
        String var2 = "";
        if (var0.charAt(0) == '-') {
            var2 = "-";
            var0 = var0.substring(1);
        }

        for (int var3 = var0.length() - 1; var3 >= 0; --var3) {
            if ((var0.length() - 1 - var3) % 3 == 0 && var0.length() - 1 - var3 > 0) {
                var1 = var0.charAt(var3) + "." + var1;
            } else {
                var1 = var0.charAt(var3) + var1;
            }
        }

        return var2 + var1;
    }

    public static String getSTR(String[] string, String string0) {
        String str = "";

        for (int i = 0; i < string.length; i++) {
            str += string[i];
            if (i < string.length - 1) {
                str += string0;
            }
        }

        return str;
    }

    public static float nextFloat(float percent, int i) {
        return rand.nextFloat(percent, i) + 1;
    }

    public static Date getDate(long milliSeconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return calendar.getTime();
    }

    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public static String dateToString(Date date, String dateFormat) {
        SimpleDateFormat DateFor = new SimpleDateFormat(dateFormat);
        return DateFor.format(date);
    }

    public static boolean isSameWeek(Date date1, Date date2) {
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        int year1 = c.get(Calendar.YEAR);
        int week1 = c.get(Calendar.WEEK_OF_YEAR);

        Calendar c2 = Calendar.getInstance();
        c2.setTime(date2);
        int year2 = c2.get(Calendar.YEAR);
        int week2 = c2.get(Calendar.WEEK_OF_YEAR);
        if (year1 == year2) {
            if (week1 == week2) {
                return true;
            }
        }
        return false;
    }

    public static String getCurrency(long number) {
        return numberFormat.format(number);
    }

    public static int randomWithRate(int[] percent, int max) {
        int next = nextInt(max), i = 0;

        for (i = 0; i < percent.length; i++) {
            if (next < percent[i]) {
                return i;
            }
            next -= percent[i];
        }
        return i;

    }

    public static double calculateCriticalHitPercentage(int currentRate) {
        double maxRate = 3000.0;
        double maxPercentage = 75.0;
        return (currentRate / maxRate) * maxPercentage;
    }

    public static int randomWithRate(int[] percent) {
        int sum = (int) sum(percent);
        int next = nextInt(sum), i;
        for (i = 0; i < percent.length; i++) {
            if (next < percent[i]) {
                return i;
            }
            next -= percent[i];
        }
        return i;
    }

    public static long sum(int... numbers) {
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static boolean randomCriticalHit(int currentRate) {
        double critHitPercentage = calculateCriticalHitPercentage(currentRate);
        double randomValue = rand.nextDouble() * 100; // Random value between 0 and 100
        return randomValue <= critHitPercentage;
    }

    public static void schedule(Runnable runnable, int hours, int minutes, int seconds) {
        LocalDateTime localNow = LocalDateTime.now();
        ZoneId currentZone = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime zonedNow = ZonedDateTime.of(localNow, currentZone);
        ZonedDateTime zonedNext5 = zonedNow.withHour(hours).withMinute(minutes).withSecond(seconds);
        if (zonedNow.compareTo(zonedNext5) > 0) {
            zonedNext5 = zonedNext5.plusDays(1);
        }

        Duration duration = Duration.between(zonedNow, zonedNext5);
        long initalDelay = duration.getSeconds();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(runnable, initalDelay, 1 * 24 * 60 * 60, TimeUnit.SECONDS);
    }

    public static boolean checkExist(ArrayList<Integer> array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static Object randomObject(Object... array) {
        return array[nextInt(array.length)];
    }

    public static boolean nextBoolean() {
        return nextInt(2) == 0;
    }
}
