package com.vdtt.effect;

import com.vdtt.item.Item;
import com.vdtt.map.MapService;
import com.vdtt.model.Char;
import com.vdtt.network.Message;
import com.vdtt.network.Service;
import com.vdtt.task.TaskOrder;
import com.vdtt.util.Log;
import org.json.simple.JSONArray;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EffectManager {

    private final Char player;

    private final List<Effect> list;
    private boolean[] statusEffectWithID;
    private boolean[] statusEffectWithType;
    private boolean[] statusEffectWithIDPet;
    private boolean[] statusEffectWithTypePet;

    public EffectManager(Char player) {
        this.player = player;
        int size = EffectTemplateManager.getInstance().size();
        this.list = new ArrayList<>();
        this.statusEffectWithID = new boolean[size];
        this.statusEffectWithIDPet = new boolean[size];
        this.statusEffectWithType = new boolean[size];
        this.statusEffectWithTypePet = new boolean[size];
    }

    public void add(Effect effect) {
        synchronized (list) {
            list.add(effect);
        }
    }

    public int size() {
        return list.size();
    }

    public void remove(Effect effect) {
        synchronized (list) {
            list.remove(effect);
        }
    }

    public void setStatus(Effect eff, boolean status) {
        statusEffectWithID[eff.template.id] = status;
        statusEffectWithType[eff.template.type] = status;
    }

    public Effect findByID(int id) {
        synchronized (list) {
            if (statusEffectWithID[id]) {
                for (Effect eff : list) {
                    if (eff.template.id == id&&!eff.isPet) {
                        return eff;
                    }
                }
            }
        }
        return null;
    }

    public Effect findByIDPet(int id) {
        synchronized (list) {
            if (statusEffectWithIDPet[id]) {
                for (Effect eff : list) {
                    if (eff.template.id == id && eff.isPet) {
                        return eff;
                    }
                }
            }
        }
        return null;
    }

    public Effect findByType(byte type) {
        synchronized (list) {
            if (statusEffectWithType[type]) {
                for (Effect eff : list) {
                    if (eff.template.type == type&&!eff.isPet) {
                        return eff;
                    }
                }
            }
        }
        return null;
    }
    public Effect findByTypePet(byte type) {
        synchronized (list) {
            if (statusEffectWithTypePet[type]) {
                for (Effect eff : list) {
                    if (eff.template.type == type&&eff.isPet) {
                        return eff;
                    }
                }
            }
        }
        return null;
    }

    public void update() {
        List<Effect> listExpired = filter(e -> e.isExpired());
        if (!listExpired.isEmpty()) {
            boolean isSetAbility = false;
            for (Effect eff : listExpired) {
                removeEffect(eff);
                if (player.zone != null) {
                    player.zone.getService().playerRemoveEffect(player, eff);
                }
                short type = eff.template.type;
                short effId = eff.template.id;
                if ((effId >= 85 && effId <= 130) || (effId >= 172 && effId <= 175)||effId==140) {
                    isSetAbility = true;
                }
            }
            if (isSetAbility) {
                player.setAbility();
            }
        }
    }

    public byte[] getData() {
        return new byte[]{0};
    }

    public List<Effect> filter(Predicate<Effect> predicate) {
        synchronized (list) {
            return list.stream().filter(predicate).collect(Collectors.toList());
        }
    }

    public boolean statusWithID(int id) {
        return statusEffectWithID[id];
    }

    public boolean statusWithType(int type) {
        return statusEffectWithType[type];
    }

    public void addTime(int id, long time) {
        Effect e = findByID(id);
        if (e != null) {
            e.addTime(time);
        }
    }

    public void setEffect(Effect effect) {
        short type = effect.template.type;
        int id = effect.template.id;
        add(effect);
        effect(effect, true);
        player.zone.getService().playerAddEffect(player, effect);

    }

    public void removeEffect(Effect eff) {
        effect(eff, false);
        remove(eff);
    }

    public void effect(Effect eff, boolean is) {
        int type = eff.template.type;
        int id = eff.template.id;
        if(eff.isPet){
            statusEffectWithIDPet[id] = is;
            statusEffectWithTypePet[type] = is;
            if(player.pet!=null){
                player.pet.setAbility();
            }
            return;
        }
        setStatus(eff, is);
        switch (id) {
            case 117:
                if(!is&&player.taskOrders!=null&&!player.taskOrders.isComplete()){
                    if(player.taskOrders.taskId== TaskOrder.TASK_MAI_RUA){
                        player.taskOrders.updateTask(1);
                    }
                }
                break;
            case 132:
                if(!is){
                    if(player.clan == null){
                        return;
                    }
                    Item item = new Item(910);
                    item.setQuantity((150-(eff.getParam()*10))*2);
                    item.setLock(true);
                    player.clan.themItem(item);
                }
                break;
            case 152:
                player.isSocola= is;
                break;
        }
        switch (type) {
            case 77:
                player.isSuperSayan = is;
                break;
            case 121:
                player.isLuongLongNhatThe = is;
                break;
        }
        player.setAbility();
    }

    public void clearScrAllEffect(Service service, MapService mapService, Char p) {
        synchronized (list) {
            for (Effect eff : list) {
                mapService.playerRemoveEffect(p, eff);
            }
        }
    }

    public void displayAllEffect(Service service, MapService mapService, Char p) {
        synchronized (list) {
            for (Effect eff : list) {
                if (mapService != null && p != null) {
                    mapService.playerAddEffect(p, eff);
                }
            }
        }
    }

    public JSONArray toJSONArray() {
        JSONArray effects = new JSONArray();
        synchronized (list) {
            for (Effect eff : list) {
                int type = eff.template.type;
                int effId = eff.template.id;
                if(effId == 117){
                    effects.add(eff.toJSONObject());
                }
                if ((effId >= 85 && effId <= 130) || (effId >= 172 && effId <= 175) || effId == 59 || effId == 136|| effId == 132 || effId == 137 || effId == 138||effId == 140||effId == 205||effId == 197||effId == 152) {
                    continue;
                }
                effects.add(eff.toJSONObject());

            }
        }
        return effects;
    }

    public void clear() {
        synchronized (list) {
            list.clear();
        }
    }

    public EffectManager clone(Char p) {
        EffectManager em = new EffectManager(p);
        synchronized (list) {
            list.forEach(e -> {
                Effect newEffect = new Effect(e.template.id, e.getStartAt(), e.getEndAt(), e.getParam());
                newEffect.param2 = e.getParam2();
                em.add(newEffect);
            });
        }
        return em;
    }

    private int getIndexById(byte id) {
        int index = 0;
        synchronized (list) {
            for (Effect e : list) {
                if (e.template.id == id) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    private int getIndexByType(byte type) {
        int index = 0;
        synchronized (list) {
            for (Effect e : list) {
                if (e.template.type == type) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public void write(Message m) {
        try {
            synchronized (list) {
                m.writer().writeByte(list.size());
                for (Effect e : list) {
                    e.write(m);
                }
            }
        } catch (IOException e) {

        }
    }
}
