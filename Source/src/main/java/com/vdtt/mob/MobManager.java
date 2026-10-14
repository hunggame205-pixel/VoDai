package com.vdtt.mob;

import java.util.ArrayList;
import java.util.List;

public class MobManager {
    private static final MobManager instance = new MobManager();
    public static MobManager getInstance() {
        return instance;
    }
    public List<MobNew> mobNews= new ArrayList<>();

    public void addMobNew(MobNew mobNew) {
        mobNews.add(mobNew);
    }
    public void removeMobNew(MobNew mobNew) {
        mobNews.remove(mobNew);
    }
    public MobNew getMobNew(int id) {
        for (MobNew mobNew : mobNews) {
            if (mobNew.id == id) {
                return mobNew;
            }
        }
        return null;
    }

}
