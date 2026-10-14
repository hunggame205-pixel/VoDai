package com.vdtt.network;

import com.vdtt.clan.Clan;
import com.vdtt.db.DbManager;
import com.vdtt.effect.Effect;
import com.vdtt.map.MapManager;
import com.vdtt.model.Char;
import com.vdtt.model.Pet;
import com.vdtt.model.User;
import com.vdtt.server.ServerManager;
import com.vdtt.server.ShowRanked;
import com.vdtt.stall.StallManager;
import com.vdtt.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller implements IMessageHandler {
    private final Session client;
    private Service service;
    private User user;
    private Char _char;

    public Controller(Session client) {
        this.client = client;
    }

    public void setUser(User us) {
        this.user = us;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setChar(Char _char) {
        this._char = _char;
    }

    @Override
    public void onMessage(Message mss) {
        if (mss != null) {
            try {
                int command = mss.getCommand();
      //          Log.debug("Command: " + command);
                if (command != -127 && command != -113 && command != -124 && command != -123 && command != -122
                        && command != Session.CMD_REGISTER) {
                    if (user == null || _char == null || user.isCleaned || _char.isCleaned) {
                        return;
                    }
                }
                switch (command) {
                    case -35:
                        _char.updateThienSu(mss);
                        break;
                    case -127:
//                        String keyApp = mss.readUTF();
                        break;
                    case Session.CMD_REGISTER:
                        client.register(mss);
                        break;
                    case -113:
                        client.readKey(mss);
                        break;
                    case -123:
                        messageSub_123(mss);
                        break;
                    case -124:
                        user.createCharacter(mss);
                        break;
                    case -122:
                        messageSub_122(mss);
                        break;
                    case 21:
                        _char.chatPublic(mss);
                        break;
                    case 127:
                        _char.requestChangeMap();
                        break;
                    case 14:
                        _char.learnSkill(mss);
                        break;
                    case 63:
                        _char.showDame(mss);
                        break;
                    case -6:
                        service.openTabZone();
                        break;
                    case 116:
                        _char.useItem(mss);
                        break;
                    case 113:
                        _char.itemBodyToBag(mss);
                        break;
                    case -56:
                        short var = mss.reader().readShort();
                        service.showKI();
//                        service.updateIndexBag();
//                        service.sendInfoMount(_char);
                        break;
                    case -62:
                        _char.showKIChar(mss);
                        break;
                    case 13:
                        short idMob = mss.reader().readShort();
                        service.showMob(idMob);
                        break;
                    case -7:
                        _char.changeZone(mss);
                        break;
                    case 54:
                        _char.openMenu(mss);
                        break;
                    case 53:
                        _char.menu(mss);
                        break;
                    case 122:
                        messageGUI(mss);
                        break;
                    case 115:
                        _char.itemBagToBox(mss);
                        break;
                    case 114:
                        _char.itemBoxToBag(mss);
                        break;
                    case 49:
                        _char.wakeUpFromDead(mss);
                        break;
                    case 48:
                        _char.returnFromDead(mss);
                        break;
                    case 121:
                        _char.buyItem(mss);
                        break;
                    case 117:
                        _char.sortItem(mss);
                        break;
                    case 107:
                        _char.upgradeItem(mss);
                        break;
                    case -25:
                        _char.confirmMenuItem(mss);
                        break;
                    case -50:
                        _char.ghepCaiTrang(mss);
                        break;
                    case 36:
                        _char.itemBagToBody2(mss);
                        break;
                    case 37:
                        _char.itemBody2ToBag(mss);
                        break;
                    case 35:
                        _char.itemBodyChange(mss);
                        break;
                    case -52:
                        _char.showCaiTrangTach(mss);
                        break;
                    case -51:
                        _char.tachCaiTrang(mss);
                        break;
                    case 108:
                        _char.upPearl(mss);
                        break;
                    case -46:
                        _char.khamNgoc(mss);
                        break;
                    case -47:
                        _char.tachKham(mss);
                        break;
                    case 105:
                        _char.splitItem(mss);
                        break;
                    case 95:
                        int idMail = mss.reader().readShort();
                        _char.mailManager.receiveMail(idMail);
                        break;
                    case 88:
                        _char.removeMail(mss);
                        break;
                    case 111:
                        _char.throwItem(mss);
                        break;
                    case 118:
                        _char.inputNumberSplit(mss);
                        break;
                    case 119:
                        _char.saleItem(mss);
                        break;
                    case 59:
                        _char.pickItem(mss);
                        break;
                    case 39:
                        _char.addPartyAccept(mss);
                        break;
                    case 41:
                        if (mss.reader().available() == 0)
                            _char.createGroup();
                        else
                            _char.addParty(mss);
                        break;
                    case 42:
                        _char.lockParty();
                        break;
                    case 43:
                        if (_char.getGroup() != null) {
                            _char.getGroup().getGroupService().playerInParty();
                        }
                        break;
                    case 44:
                        _char.outParty();
                        break;
                    case 45:
                        _char.openFindParty();
                        break;
                    case 46:
                        _char.changeTeamLeader(mss);
                        break;
                    case 47:
                        _char.moveMember(mss);
                        break;
                    case 12:
                        _char.updateTaskCount(1);
                        break;
                    case 34:
                        _char.checkInfo(mss);
                        break;
                    case 26:
                        if (_char.getGroup() != null) {
                            _char.getGroup().getGroupService().chat(_char.name, mss.readUTF());
                        }
                        break;
                    case 22:
                        _char.chatGlobal(mss);
                        break;
                    case 28:
                        _char.chatPrivate(mss);
                        break;
                    case -15:
                        if (_char.zone.map.isHell() || _char.zone.map.isNgucTu() || _char.zone.map.isEvent() || _char.zone.map.isSaoDen() || _char.zone.map.isVoDai()) {
                            _char.serverDialog("Không thể đổi cờ ở map này");
                            return;
                        }
                        _char.setTypePk(mss.reader().readByte());
                        break;
                    case 72:
                        if(_char.exp <= 2390000){
                            _char.serverDialog("Bạn cần 239k sức mạnh để sử dụng chức năng này");
                            return;
                        }
                        byte type = mss.reader().readByte();
                        _char.getQuaySo().spin(_char, type);
                        break;
                    case 74:
                        _char.claimQuaySo(mss);
                        break;
                    case 25:
                        if (_char.clan != null) {
                            _char.clan.getClanService().chat(_char.name, mss.readUTF());
                        }
                        break;
                    case 62:
                        _char.learnSkillPet(mss);
                        break;
                    case 86:
                        _char.tradeInvite(mss);
                        break;
                    case 85:
                        if (_char.trade != null) {
                            _char.trade.openUITrade();
                        }
                        break;
                    case 82:
                        _char.tradeItemLock(mss);
                        break;
                    case 81:
                        _char.tradeAccept();
                        break;
                    case 84:
                        _char.tradeClose();
                        break;
                    case 83:
                        _char.tradeClose();
                        break;
                    case -22:
                        ShowRanked.gI().show(mss, _char);
                        break;
                    case -33:
                        _char.input(mss);
                        break;
                    case 5:
                        _char.submenu(mss);
                        break;
                    case 87:
                        _char.sendMail(mss);
                        break;
                    case 101:
                        _char.openUIStall(mss);
                        break;
                    case 99:
                        _char.saleItemToStall(mss);
                        break;
                    case 100:
                        StallManager.getInstance().openUIMeSell(_char);
                        break;
                    case 98:
                        _char.buyItemStall(mss);
                        break;
                    case -19:
                        _char.raoBan(mss);
                        break;
                    case 79:
                        _char.addFriend(mss);
                        break;
                    case 76:
                        _char.removeFriend(mss);
                        break;
                    case 104:
                        _char.hoanChuyen(mss);
                        break;
                    case 32:
                        _char.testInvite(mss);
                        break;
                    case 31:
                        _char.testAccept(mss);
                        break;
                    case 19:
                        _char.addCuuSat(mss);
                        break;
                    case -125:
                        messageSub_125(mss);
                        break;
                    default:
                        Log.debug("Command not found: " + command);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void messageSub_125(Message mss) {
        try {
            byte cmd = mss.reader().readByte();
            switch (cmd) {
                case -128:
                    _char.verifyCaptcha(mss);
                    break;
                case -127:
                    service.sendCaptcha();
                    break;
            }
        } catch (IOException e) {

        }
    }

    private void messageGUI(Message mss) {
        try {
            if (user == null || _char == null || user.isCleaned || _char.isCleaned) {
                return;
            }
            int command = mss.reader().readByte();
            Log.debug("GUI ID: " + command);
            switch (command) {
                case 72:
                    service.openUITask();
                    break;
                case 50:
                    service.openBox();
                    break;
                case 54:
                    if (_char.clan == null) {
                        service.showListVuTru();
                    } else {
                        service.sendInfoVuTru();
                    }
                    if (_char.taskId == 17 && _char.taskMain != null && _char.taskMain.index == 0) {
                        _char.updateTaskCount(1);
                    }
                    break;
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    _char.requestItem((byte) command);
                    break;
                case 82:
                    service.openGUI(82);
                    break;
                case 111:
                    if (_char.taskId == 5 && _char.taskMain != null && _char.taskMain.index == 0) {
                        _char.updateTaskCount(1);
                    }
                    service.thongBao(mss);
                    break;
                case 94:
                    service.openGUI(94);
                    break;
                case 95:
                    service.openGUI(95);
                    break;
                case 108:
                    service.hopNhatItem();
                    break;
                case 89:
                    service.openNapLanDau();
                    break;
                case 88:
                    service.openRewardDaily();
                    break;
                case 92:
                    if (_char.taskId == 3 && _char.taskMain != null && _char.taskMain.index == 0) {
                        _char.updateTaskCount(1);
                    }
                    break;
                case 86:
                    service.openQuaySo();
                    break;
                case 97:
                    break;
                default:
                    service.openGUI(command);
             //       Log.debug("Command not found(122): " + command);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void messageSub_122(Message mss) {
        try {
            int command = mss.reader().readByte();
            switch (command) {
                case -127:
                    selectChar(mss);
                    break;
                default:
               //     Log.debug("Command not found(-122): " + command);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void selectChar(Message mss) {
        try {
            int id = mss.reader().readByte();
            Char aChar = user.chars.get(0);

            if (!aChar.load()) {
                client.close();
                return;
            }
            if (aChar.online) {
                service.serverDialog("Nhân vật chưa lưu xong dữ liệu.");
                Thread.sleep(1000);
                if (!user.isCleaned) {
                    client.close();
                }
                return;
            }
            user.sltChar = aChar;
            user.sltChar.setLoadFinish(true);
            user.chars.clear();
            service.selectChar(user);
            service.sendIntoGame(user.sltChar);
            setChar(user.sltChar);
            MapManager.getInstance().getMaps().get(user.sltChar.mapId).joinZone(user.sltChar, 0, -1);
            if (user.sltChar.zone.map.isWorld() || user.sltChar.zone.map.isEvent() || user.sltChar.zone.map.isSaoDen()) {
                if(!user.sltChar.zone.map.isNamec())
                MapManager.getInstance().getMaps().get(86).joinZone(user.sltChar, 0, 0);
            }
            user.sltChar.setAbility();
            user.sltChar.hp = user.sltChar.maxHP;
            user.sltChar.mp = user.sltChar.maxMP;
            service.updateHP();
            service.updateMP();
            service.updateHPFull();
            service.updateMPFull();
            user.sltChar.preLoad();
            ServerManager.addChar(user.sltChar);
            service.updateTienIch();
            service.sendSachChienDau();
            _char.zone.getService().meLive(_char);
            if (_char.body[0] != null) {
                _char.pet = new Pet(_char.id, _char.body[0], _char.body, _char.body2, service, _char.getEm());
                _char.pet.player = _char;
                _char.pet.zone = _char.zone;
            }
            long timeReming = _char.timeZoom - System.currentTimeMillis();
            if (timeReming > 0) {
                Effect effect = new Effect(116, timeReming, 0);
                _char.getEm().setEffect(effect);
            }
            service.updateSkillCaiTrang();
            service.updateSkill();
            checkBugLogin(_char.id,_char.name);
        } catch (Exception e) {
            e.printStackTrace();
            client.closeMessage();
        }
    }
    public void checkBugLogin(int id,String name){
        List<Char> chars = ServerManager.getChars();
        List<Char>check = new ArrayList<>();
        for(Char c : chars){
            if(c.id == id || c.name.equals(name)){
                check.add(c);
            }
        }
        if(check.size() > 1){
            DbManager.getInstance().banuntil_account(user.username,9999);
            for(Char c : check){
                c.user.session.close();
            }
        }
    }


    @Override
    public void messageNotMap(Message ms) {

    }

    public void messageSub_123(Message ms) {
        try {
            int command = ms.reader().readByte();
            if (command != -127 && command != -126 && command != Session.CMD_REGISTER) {
                if (user == null || _char == null || user.isCleaned || _char.isCleaned) {
                    return;
                }
            }
            Log.debug("-123_ " + command);
            switch (command) {
                case -127:
                    client.login(ms);
                    break;
                case -126:
                    service.sendTabLogin();
                    service.resetNetwork();
                    break;
                case Session.CMD_REGISTER:
                    client.register(ms);
                    break;
                case 6:
                    service.showPet();
                    break;
                case -73:
                    _char.getInfo2(ms);
                    break;
                case -74:
                    _char.selectDanhhieu = ms.reader().readByte();
                    service.updateTitle();
                    break;
                case -47:
                    _char.showInfoGhepCT(ms);
                    break;
                case 19:
                    Log.debug("var: " + ms.reader().readByte());// level bien hinh
                    break;
                case -42:
                    _char.ducLoKham(ms);
                    break;
                case 18:
                    _char.convertUpgrade(ms);
                    break;
                case -50:
                    _char.reciveAllMail();
                    break;
                case -70:
                    _char.claimedReward(ms);
                    break;
                case -60:
                    _char.drawRewardDaily();
                    break;
                case -63:
                    _char.buyPackReward(ms);
                    break;
                case -82:
                    _char.extendBox();
                    break;
                case -57:
                    service.sendDuaTop();
                    break;
                case -18:
                    if (_char.zone.map.isNgucTu()) {
                        _char.changeMap(54);
                    } else if (_char.zone.map.isGDSM()||_char.zone.map.isVoDai()) {
                        _char.changeMap(53);
                    } else
                        _char.changeMap(56);
                    break;
                case -11:
                    _char.checkDoneTask();
                    break;
                case -85:
                    _char.thuVanMay(ms);
                    break;
                case -106:
                    _char.createClan(ms);
                    break;
                case -105:
                    _char.clanInvite(ms);
                    break;
                case -100:
                    _char.acceptInviteClan(ms);
                    break;
                case -102:
                    _char.declineIntiveClan(ms);
                    break;
                case -104:
                    _char.requestJoinClan(ms);
                    break;
                case -101:
                    _char.acceptRequestJoinClan(ms);
                    break;
                case -10:
                    service.openSettingClan();
                    break;
                case -99:
                    _char.changeClanType(ms);
                    break;
                case -9:
                    _char.setTimeDunClan(ms);
                    break;
                case -96:
                    _char.outClan();
                    break;
                case -97:
                    _char.moveOutClan(ms);
                    break;
                case -95:
                    _char.inputCoinClan(ms);
                    break;
                case -93:
                    if (_char.clan != null) {
                        String alert = ms.readUTF();
                        int typeClan = _char.clan.getMemberByName(_char.name).getType();
                        if (typeClan == Clan.TYPE_TOCTRUONG || typeClan == Clan.TYPE_TOCPHO) {
                            _char.clan.setAlert(alert);
                            service.resetScreen();
                            service.sendInfoVuTru();
                        }
                    }
                    break;
                case 24:
                    _char.uocRongCerealian(ms);
                    break;
                case -48:
                    short mapId = ms.reader().readShort();
                    short var2 = ms.reader().readShort();
                    short var3 = ms.reader().readShort();
                    short var4 = ms.reader().readShort();
                    short var5 = ms.reader().readShort();
                    if (var2 == -1 && var3 == -1 && var4 == 0 && var5 == 0) {
                        MapManager.getInstance().joinZone(_char, mapId, 0, -1);
                    }
                    break;
                case 12:
                    Effect effect = new Effect(145, 60000, 300);
                    _char.getEm().setEffect(effect);
                    break;
                case 8:
                    _char.petManager(ms);
                    break;
                case 4:
                    _char.uocRongEath(ms);
                    break;
                case 26:
                    _char.uocRongNoel(ms);
                    break;
                case 5:
                    _char.uocRongSaoDen(ms);
                    break;
                case -58:
                    byte type = ms.reader().readByte();
                    service.updateHinhAnh(type);
                    break;
                case -68:
                    _char.learnSkillClan(ms);
                    break;
                case -24:
                    _char.buyChangeCaiTrang();
                    break;
                case 14:
                    _char.changeCaiTrang(ms);
                    break;
                case 13:
                    _char.viewInfoChangeCaiTrang(ms);
                    break;
                case -94:
                    _char.withDrawCoinClan(ms);
                    break;
                case -90:
                    _char.phatItemClan(ms);
                    break;
                case -25:
                    _char.hopNhatItem(ms);
                    break;
//                case -38:
//                    _char.claimArchivement(ms);
//                    break;
                case 11:
                    _char.activeCDV(ms);
                    break;
                case -15:
                    _char.viewZoneAttack(ms);
                    break;
                case -118:
                    _char.viewInfoMount(ms);
                    break;
                case 10:// rong namec
                    _char.uocRongNamec(ms);
                    break;
                default:
          //          Log.debug("Command not found(-123): " + command);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void messageNotLogin(Message ms) {

    }
}
