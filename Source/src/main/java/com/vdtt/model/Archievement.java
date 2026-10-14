package com.vdtt.model;

import com.vdtt.util.ParseData;
import org.json.simple.JSONObject;

public class Archievement {
    public byte hellArchivement;
    public byte jailArchivement;
    public byte jail2Archivement;
    public byte timeZoomArchivement;
    public byte voDaiArchivement;
    public byte giaiDauArchivement;
    public byte taskQuyLaoArchivement;
    public short taskQuyLao2Archivement;
    public byte chatVipArchivement;
    public byte chatArchivementl;
    public byte peanutArchivement;
    public byte rewardPerWeekArchivement;
    public byte rewardClanArchivement;
    public byte sieuQuaiArchivement;
    public short sieuQuai2Archivement;
    public byte tinhAnhArchivement;
    public short tinhAnh2Archivement;
    public byte thuLinhArchivement;
    public short thuLinh2Archivement;
    public byte killBossArchivement;
    public byte killBoss2Archivement;
    public byte tienIchArchivement;
    public byte capsuleArchivement;
    public byte countArchivement;
    public JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("hellArchivement", hellArchivement);
        obj.put("jailArchivement", jailArchivement);
        obj.put("timeZoomArchivement", timeZoomArchivement);
        obj.put("voDaiArchivement", voDaiArchivement);
        obj.put("giaiDauArchivement", giaiDauArchivement);
        obj.put("taskQuyLaoArchivement", taskQuyLaoArchivement);
        obj.put("taskQuyLao2Archivement", taskQuyLao2Archivement);
        obj.put("chatVipArchivement", chatVipArchivement);
        obj.put("chatArchivementl", chatArchivementl);
        obj.put("peanutArchivement", peanutArchivement);
        obj.put("rewardPerWeekArchivement", rewardPerWeekArchivement);
        obj.put("rewardClanArchivement", rewardClanArchivement);
        obj.put("sieuQuaiArchivement", sieuQuaiArchivement);
        obj.put("sieuQuai2Archivement", sieuQuai2Archivement);
        obj.put("tinhAnhArchivement", tinhAnhArchivement);
        obj.put("tinhAnh2Archivement", tinhAnh2Archivement);
        obj.put("thuLinhArchivement", thuLinhArchivement);
        obj.put("thuLinh2Archivement", thuLinh2Archivement);
        obj.put("killBossArchivement", killBossArchivement);
        obj.put("tienIchArchivement", tienIchArchivement);
        obj.put("capsuleArchivement", capsuleArchivement);
        obj.put("countArchivement", countArchivement);
        obj.put("killBoss2Archivement", killBoss2Archivement);
        obj.put("jail2Archivement", jail2Archivement);
        return obj;
    }
    public Archievement(){
    }
    public Archievement (ParseData ps){
        hellArchivement = ps.getByte("hellArchivement");
        jailArchivement = ps.getByte("jailArchivement");
        jail2Archivement = ps.getByte("jail2Archivement");
        timeZoomArchivement = ps.getByte("timeZoomArchivement");
        voDaiArchivement = ps.getByte("voDaiArchivement");
        giaiDauArchivement = ps.getByte("giaiDauArchivement");
        taskQuyLaoArchivement = ps.getByte("taskQuyLaoArchivement");
        taskQuyLao2Archivement = ps.getShort("taskQuyLao2Archivement");
        chatVipArchivement = ps.getByte("chatVipArchivement");
        chatArchivementl = ps.getByte("chatArchivementl");
        peanutArchivement = ps.getByte("peanutArchivement");
        rewardPerWeekArchivement = ps.getByte("rewardPerWeekArchivement");
        rewardClanArchivement = ps.getByte("rewardClanArchivement");
        sieuQuaiArchivement = ps.getByte("sieuQuaiArchivement");
        sieuQuai2Archivement = ps.getShort("sieuQuai2Archivement");
        tinhAnhArchivement = ps.getByte("tinhAnhArchivement");
        tinhAnh2Archivement = ps.getShort("tinhAnh2Archivement");
        thuLinhArchivement = ps.getByte("thuLinhArchivement");
        thuLinh2Archivement = ps.getShort("thuLinh2Archivement");
        killBossArchivement = ps.getByte("killBossArchivement");
        killBoss2Archivement = ps.getByte("killBoss2Archivement");
        tienIchArchivement = ps.getByte("tienIchArchivement");
        capsuleArchivement = ps.getByte("capsuleArchivement");
        countArchivement = ps.getByte("countArchivement");
    }
    public int[] getArray(){
        return new int[]{hellArchivement, jailArchivement, jail2Archivement, timeZoomArchivement, voDaiArchivement, giaiDauArchivement, taskQuyLaoArchivement, taskQuyLao2Archivement, chatVipArchivement, chatArchivementl, peanutArchivement, rewardPerWeekArchivement, rewardClanArchivement, sieuQuaiArchivement, sieuQuai2Archivement, tinhAnhArchivement, tinhAnh2Archivement, thuLinhArchivement, thuLinh2Archivement, killBossArchivement, killBoss2Archivement, tienIchArchivement, capsuleArchivement, countArchivement};
    }
}
