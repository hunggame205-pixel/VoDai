package com.vdtt.server;

import java.util.ArrayList;
import java.util.List;

public class MountManager {
    private static final MountManager instance = new MountManager();
    public static MountManager getInstance() {
        return instance;
    }
    public List<Mount> mounts = new ArrayList<>();
    public void addMount(Mount mount) {
        mounts.add(mount);
    }
    public void removeMount(Mount mount) {
        mounts.remove(mount);
    }
    public Mount getMount(int id) {
        for (Mount mount : mounts) {
            if (mount.id == id) {
                return mount;
            }
        }
        return null;
    }
}
