package com.vdtt.data;

import com.vdtt.item.Item;
import com.vdtt.item.ItemManager;
import com.vdtt.item.ItemTemplate;
import com.vdtt.model.Char;

public class DataTemplateAchievement {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public Item a(Char p) {
        try {
            if (this.h != null && this.h.length() > 0) {
                String[] var1 = this.h.split("@");
                Item var2;
                var2 = new Item(Short.parseShort(var1[0]));
                var2.isLock = Boolean.parseBoolean(var1[1]);
                var2.expire = Long.parseLong(var1[2]);
                var2.setQuantity(Integer.parseInt(var1[3]));
                if (var1.length > 6) {
                    var2.strOption = var1[6];
                }
                return var2;
            }
        } catch (Exception var4) {
        }

        return null;
    }
}
