package com.vdtt.server;

import com.vdtt.map.MapManager;
import com.vdtt.util.VDTTUtlis;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SpawnBossManager {
    public static final byte ALL = 0;
    public static final byte RANDOM = 1;
    public static final String FIDE = "fide";
    public static final String TUONG_LAI = "tuonglai";
    public static final String VAMPA = "vampa";
    public static final String NAMEC = "namec";
    public static final String YARDAT = "yardat";
    public static final String ZAMASU = "zamasu";
    public static final String HOANG_MAC = "hoangmac";
    public static final String EVENT = "event";

    public static final String NOEL = "noel";

    public static int zoneTDST = 0;



    private static final SpawnBossManager instance = new SpawnBossManager();

    public static SpawnBossManager getInstance() {
        return instance;
    }

    private final HashMap<String, List<SpawnBoss>> spawnBosses = new HashMap<>();
    public void init() {
        final List<SpawnBoss> mapFIDE = new ArrayList<>();
        final List<SpawnBoss> mapTUONGLAI = new ArrayList<>();
        final List<SpawnBoss> mapVAMPA = new ArrayList<>();
        final List<SpawnBoss> mapYARDAT = new ArrayList<>();
        final List<SpawnBoss> mapNAMEC = new ArrayList<>();
        final List<SpawnBoss> zamasu = new ArrayList<>();
        final List<SpawnBoss> moro = new ArrayList<>();
        final List<SpawnBoss> Event = new ArrayList<>();
        final List<SpawnBoss> noel = new ArrayList<>();


        SpawnBoss spawnBoss24 = create(1, 57, (short) 910, (short) 362,50000000, 50000);
        spawnBoss24.add(1, 273);
        zamasu.add(spawnBoss24);
        SpawnBoss spawnBoss25 = create(2, 62, (short) 1755, (short) 418,50000000, 50000);
        spawnBoss25.add(1, 273);
        zamasu.add(spawnBoss25);
        SpawnBoss spawnBoss26 = create(3, 66, (short) 353, (short) 486,50000000, 50000);
        spawnBoss26.add(1, 273);
        zamasu.add(spawnBoss26);
        SpawnBoss spawnBoss27 = create(4, 61, (short) 2377, (short) 418,50000000, 50000);
        spawnBoss27.add(1, 273);
        zamasu.add(spawnBoss27);
        SpawnBoss spawnBoss28 = create(5, 55, (short) 1569, (short) 429,50000000, 50000);
        spawnBoss28.add(1, 273);
        zamasu.add(spawnBoss28);
        SpawnBoss spawnBoss29 = create(6, 64, (short) 1820, (short) 433,50000000, 50000);
        spawnBoss29.add(1, 273);
        zamasu.add(spawnBoss29);
        SpawnBoss spawnBoss30 = create(7, 65, (short) 874, (short) 489,50000000, 50000);
        spawnBoss30.add(1, 273);
        zamasu.add(spawnBoss30);
        SpawnBoss spawnBoss31 = create(8, 63, (short) 2294, (short) 440,50000000, 50000);
        spawnBoss31.add(1, 273);
        zamasu.add(spawnBoss31);


        SpawnBoss spawnBoss4 = create(1, 57, (short) 910, (short) 362,10000000, 1000);
        spawnBoss4.add(1, 199);
        mapFIDE.add(spawnBoss4);
        SpawnBoss spawnBoss5 = create(2, 62, (short) 1755, (short) 418,10000000, 1000);
        spawnBoss5.add(1, 199);
        mapFIDE.add(spawnBoss5);
        SpawnBoss spawnBoss6 = create(3, 66, (short) 353, (short) 486,10000000, 1000);
        spawnBoss6.add(1, 199);
        mapFIDE.add(spawnBoss6);
        SpawnBoss spawnBoss7 = create(4, 61, (short) 2377, (short) 418,10000000, 1000);
        spawnBoss7.add(1, 199);
        mapFIDE.add(spawnBoss7);
        SpawnBoss spawnBoss8 = create(5, 55, (short) 1569, (short) 429,25000000, 5000);
        spawnBoss8.add(1, 200);
        mapTUONGLAI.add(spawnBoss8);
        SpawnBoss spawnBoss9 = create(6, 64, (short) 1820, (short) 433,25000000, 5000);
        spawnBoss9.add(1, 200);
        mapTUONGLAI.add(spawnBoss9);
        SpawnBoss spawnBoss10 = create(7, 65, (short) 874, (short) 489,25000000, 5000);
        spawnBoss10.add(1, 200);
        mapTUONGLAI.add(spawnBoss10);
        SpawnBoss spawnBoss11 = create(8, 63, (short) 2294, (short) 440,25000000, 5000);
        spawnBoss11.add(1, 200);
        mapTUONGLAI.add(spawnBoss11);
        SpawnBoss spawnBoss12 = create(9, 88, (short) 303, (short) 416,100000000, 15000);
        spawnBoss12.add(1, 201);
        mapVAMPA.add(spawnBoss12);
        SpawnBoss spawnBoss13 = create(10, 74, (short) 1476, (short) 450,100000000, 15000);
        spawnBoss13.add(1, 201);
        mapVAMPA.add(spawnBoss13);
        SpawnBoss spawnBoss14 = create(11, 76, (short) 2278, (short) 459,100000000, 15000);
        spawnBoss14.add(1, 201);
        mapVAMPA.add(spawnBoss14);
        SpawnBoss spawnBoss15 = create(12, 73, (short) 2355, (short) 404,100000000, 15000);
        spawnBoss15.add(1, 201);
        mapVAMPA.add(spawnBoss15);
        SpawnBoss spawnBoss16 = create(13, 77, (short) 260, (short) 416,150000000, 25000);
        spawnBoss16.add(1, 202);
        mapNAMEC.add(spawnBoss16);
        SpawnBoss spawnBoss17 = create(14, 71, (short) 269, (short) 409,150000000, 25000);
        spawnBoss17.add(1, 202);
        mapNAMEC.add(spawnBoss17);
        SpawnBoss spawnBoss18 = create(15, 72, (short) 1772, (short) 489,150000000, 25000);
        spawnBoss18.add(1, 202);
        mapNAMEC.add(spawnBoss18);
        SpawnBoss spawnBoss19 = create(16, 70, (short) 2268, (short) 480,150000000, 25000);
        spawnBoss19.add(1, 202);
        mapNAMEC.add(spawnBoss19);
        SpawnBoss spawnBoss20 = create(17, 81, (short) 799, (short) 415,200000000, 35000);
        spawnBoss20.add(1, 203);
        mapYARDAT.add(spawnBoss20);
        SpawnBoss spawnBoss21 = create(18, 80, (short) 1599, (short) 420,200000000, 35000);
        spawnBoss21.add(1, 203);
        mapYARDAT.add(spawnBoss21);
        SpawnBoss spawnBoss22 = create(19, 79, (short) 419, (short) 424,200000000, 35000);
        spawnBoss22.add(1, 203);
        mapYARDAT.add(spawnBoss22);
        SpawnBoss spawnBoss23 = create(20, 78, (short) 1654, (short) 398,200000000, 35000);
        spawnBoss23.add(1, 203);
        mapYARDAT.add(spawnBoss23);
        SpawnBoss spawnBoss32 = create(22, 102, (short) 765, (short) 543,300000000, 50000);
        spawnBoss32.add(1,88);
        moro.add(spawnBoss32);
        SpawnBoss spawnBoss33 = create(23, 103, (short) 2115, (short) 467,300000000, 50000);
        spawnBoss33.add(1,88);
        moro.add(spawnBoss33);
        SpawnBoss spawnBoss34 = create(24, 104, (short) 1373, (short) 517,300000000, 50000);
        spawnBoss34.add(1,88);
        moro.add(spawnBoss34);
        SpawnBoss spawnBoss35 = create(25, 105, (short) 1183, (short) 557,300000000, 50000);
        spawnBoss35.add(1,88);
        moro.add(spawnBoss35);
        SpawnBoss spawnBoss36 = create(26, 44, (short) 487, (short) 594,100000000, 5000);
        spawnBoss36.add(1,134);
        Event.add(spawnBoss36);
        SpawnBoss spawnBoss37 = create(26, 44, (short) 487, (short) 594,100000000, 5000);
        spawnBoss37.add(1,134);
        Event.add(spawnBoss37);
        SpawnBoss spawnBoss38 = create(26, 44, (short) 487, (short) 594,100000000, 5000);
        spawnBoss38.add(1,134);
        Event.add(spawnBoss38);
        SpawnBoss spawnBoss39 = create(26, 44, (short) 487, (short) 594,100000000, 5000);
        spawnBoss39.add(1,134);
        Event.add(spawnBoss39);
        SpawnBoss spawnBoss40 = create(26, 44, (short) 487, (short) 594,100000000, 5000);
        spawnBoss40.add(1,134);
        Event.add(spawnBoss40);

        SpawnBoss spawnBoss41 = create(26, 83, (short) 402, (short) 378,1000000000, 5000);
        spawnBoss41.add(1,308);
        noel.add(spawnBoss41);
        SpawnBoss spawnBoss42 = create(27, 83, (short) 402, (short) 378,1000000000, 5000);
        spawnBoss42.add(1,309);
        noel.add(spawnBoss42);
        SpawnBoss spawnBoss43 = create(28, 83, (short) 402, (short) 378,1000000000, 5000);
        spawnBoss43.add(1,310);
        noel.add(spawnBoss43);
        SpawnBoss spawnBoss44 = create(29, 83, (short) 402, (short) 378,1000000000, 5000);
        spawnBoss44.add(1,311);
        noel.add(spawnBoss44);
        SpawnBoss spawnBoss45 = create(30, 83, (short) 402, (short) 378,1000000000, 5000);
        spawnBoss45.add(1,312);
        noel.add(spawnBoss45);

        spawnBosses.put(FIDE, mapFIDE);
        spawnBosses.put(TUONG_LAI, mapTUONGLAI);
        spawnBosses.put(VAMPA, mapVAMPA);
        spawnBosses.put(NAMEC, mapNAMEC);
        spawnBosses.put(YARDAT, mapYARDAT);
        spawnBosses.put(ZAMASU, zamasu);
        spawnBosses.put(HOANG_MAC, moro);
        spawnBosses.put(EVENT, Event);
        spawnBosses.put(NOEL, noel);
    }
    public SpawnBoss create(int id, int mapID, short x, short y,int hp,int kiMax) {
        SpawnBoss spawnBoss = new SpawnBoss(id, MapManager.getInstance().find(mapID), x, y,hp,kiMax);
        return spawnBoss;
    }

    public List<SpawnBoss> getListSpawnBoss(String key) {
        return spawnBosses.get(key);
    }

    public void spawnRandom(String key) {
        List<SpawnBoss> list = getListSpawnBoss(key);
        int rand = VDTTUtlis.nextInt(list.size());
//        int rand = 0;
        SpawnBoss sp = list.get(rand);
        sp.spawn();
    }

    public void spawnAll(String key) {
        List<SpawnBoss> list = getListSpawnBoss(key);
        for (SpawnBoss spawn : list) {
            try {
                spawn.spawn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void spawn(int hours, int minutes, int seconds, String key, byte type) {
        VDTTUtlis.schedule(() -> {
            if (type == ALL) {
                spawnAll(key);
            }
            if (type == RANDOM) {
                spawnRandom(key);
            }
        }, hours, minutes, seconds);
    }

    public void spawnRepeat(String key, int hourlyDelay, byte type) {
        LocalDateTime localNow = LocalDateTime.now();
        ZoneId currentZone = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime zonedNow = ZonedDateTime.of(localNow, currentZone);
        int hours = zonedNow.getHour() + 1;
        if (hours % hourlyDelay != 0) {
            hours = ((hours / hourlyDelay + 1) * hourlyDelay);
        }
        if (hours >= 24) {
            hours = 0;
        }
        ZonedDateTime zonedNext5 = zonedNow.withHour(hours).withMinute(0).withSecond(0);
        if (zonedNow.compareTo(zonedNext5) > 0) {
            zonedNext5 = zonedNext5.plusDays(1);
        }

        Duration duration = Duration.between(zonedNow, zonedNext5);
        long initalDelay = duration.getSeconds();
        Runnable runnable = new Runnable() {
            public void run() {
                if (type == ALL) {
                    spawnAll(key);
                }
                if (type == RANDOM) {
                    spawnRandom(key);
                }
            }
        };
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(runnable, initalDelay, hourlyDelay * 60 * 60, TimeUnit.SECONDS);
    }
}
