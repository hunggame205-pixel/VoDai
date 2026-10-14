package com.vdtt.skill;

import com.google.gson.JsonObject;
import com.vdtt.item.ItemOption;
import com.vdtt.item.ItemOptionTemplate;
import com.vdtt.util.ParseData;
import com.vdtt.util.VDTTUtlis;
import org.json.simple.JSONObject;

public final class Skill implements Cloneable {
    public int index;
    public short id;
    public short isSkillTemplate;
    public byte level;
    public short levelNeed;
    public short mpUsing;
    public int coolDown;
    public short rangeDoc;
    public short rangeNgang;
    public byte maxTarget;
    public long kiUpgrade;
    public String m;
    public long timeCoolDown;
    public boolean o;
    public boolean p;

    public Skill clone() {
        try {
            return (Skill) super.clone();
        } catch (Exception var2) {
            return null;
        }
    }
    public Skill() {
    }
    public ItemOption[] getItemOption() {
        if (this.m != null && this.m.length() > 0) {
            String[] var1;
            ItemOption[] var2 = new ItemOption[(var1 = VDTTUtlis.split(this.m, ";")).length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = new ItemOption(var1[var3]);
            }

            return var2;
        } else {
            return null;
        }
    }

    public boolean isCoolDown() { //cool down
            long currentTimeMillis = System.currentTimeMillis();
            long num = currentTimeMillis - timeCoolDown;
            return num < (long) (this.coolDown*80/100);
    }

    public JSONObject toJSONObject() {
        JSONObject obj = new JSONObject();
        obj.put("id", this.id);
        obj.put("level", this.level);
        obj.put("timeCoolDown", this.timeCoolDown);
        return obj;
    }
    public JSONObject toJSONObject2() {
        JSONObject obj = new JSONObject();
        obj.put("id", this.id);
        obj.put("isSkillTemplate", this.isSkillTemplate);
        obj.put("level", this.level);
        obj.put("levelNeed", this.levelNeed);
        obj.put("mpUsing", this.mpUsing);
        obj.put("coolDown", this.coolDown);
        obj.put("rangeDoc", this.rangeDoc);
        obj.put("rangeNgang", this.rangeNgang);
        obj.put("maxTarget", this.maxTarget);
        obj.put("kiUpgrade", this.kiUpgrade);
        obj.put("m", this.m);
        return obj;
    }
    public Skill (JSONObject obj) {
        ParseData parse = new ParseData(obj);
        this.index = parse.getInt("index");
        this.id = (short) parse.getInt("id");
        this.isSkillTemplate = (short) parse.getInt("isSkillTemplate");
        this.level = (byte) parse.getInt("level");
        this.levelNeed = (short) parse.getInt("levelNeed");
        this.mpUsing = (short) parse.getInt("mpUsing");
        this.coolDown = parse.getInt("coolDown");
        this.rangeDoc = (short) parse.getInt("rangeDoc");
        this.rangeNgang = (short) parse.getInt("rangeNgang");
        this.maxTarget = (byte) parse.getInt("maxTarget");
        this.kiUpgrade = parse.getLong("kiUpgrade");
        this.timeCoolDown = parse.getLong("timeCoolDown");
        this.m = parse.getString("strOption");
    }

    public SkillTemplate getSkillTemplate() {
        return SkillFactory.getInstance().getSkillTemplate(isSkillTemplate);
    }
}
