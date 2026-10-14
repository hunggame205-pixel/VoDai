package com.vdtt.map.item;

import lombok.Builder;

public class ItemMapFactory {
    public static final byte NORMAL = 0;
    private static final ItemMapFactory instance = new ItemMapFactory();

    public static ItemMapFactory getInstance() {
        return instance;
    }

    @Builder
    public ItemMap createItemMap(short id, byte type, short x, short y) {
        ItemMap item = null;
        switch (type) {
            case NORMAL:
            default:
                item = new ItemMap(id);
                break;
        }
        item.setX(x);
        item.setY(y);
        return item;
    }
}
