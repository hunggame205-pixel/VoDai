package com.vdtt.server;

import com.vdtt.clan.Clan;
import com.vdtt.db.DbManager;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ServerPanel extends WindowAdapter implements ActionListener {
private JTable playerTable;
private DefaultTableModel playerModel;
private JPanel createSystemTab ;

    private JFrame frame;
    private JTextArea infoArea;
    private Timer updateTimer;

    public ServerPanel() {
        frame = new JFrame("Menu Admin Viper");
        frame.setSize(520, 340);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Hệ thống", createSystemTab());
        tabbedPane.add("Quản lý", new JPanel());
       tabbedPane.add("Manage Player", createManagePlayerTab());


        frame.add(tabbedPane);
        frame.setVisible(true);

        updateTimer = new Timer(1000, e -> updateInfo());
        updateTimer.start();
    }
private JPanel createManagePlayerTab() {
    JPanel panel = new JPanel(null);
    panel.setBackground(new Color(235, 235, 235));

    JLabel lbTime = new JLabel("Time:");
    lbTime.setBounds(20, 15, 40, 25);
    panel.add(lbTime);

    JButton btnRefresh = new JButton("Làm mới");
    btnRefresh.setBounds(70, 10, 100, 30);
    btnRefresh.addActionListener(e -> loadPlayerTable());
    panel.add(btnRefresh);

    JButton btnKick = new JButton("Kick Selected");
    btnKick.setBounds(180, 10, 120, 30);
    btnKick.addActionListener(e -> kickSelectedPlayer());
    panel.add(btnKick);


    JButton btnBlockIp = new JButton("Block IP");
    btnBlockIp.setBounds(300, 10, 100, 30);
    btnBlockIp.addActionListener(e -> blockSelectedIP());
    panel.add(btnBlockIp);
JButton btnUnblockIp = new JButton("Gỡ block");
btnUnblockIp.setBounds(390, 10, 110, 30); // sát bên nút Block
btnUnblockIp.addActionListener(e -> unblockSelectedIP());
panel.add(btnUnblockIp);

    // ===== TABLE =====
    playerModel = new DefaultTableModel(
            new Object[]{"ID", "Tên nhân vật", "IP"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    playerTable = new JTable(playerModel);
    playerTable.setRowHeight(22);

    JScrollPane scroll = new JScrollPane(playerTable);
    scroll.setBounds(20, 50, 450, 200);
    panel.add(scroll);

    loadPlayerTable();
    return panel;
}
private void loadPlayerTable() {
    playerModel.setRowCount(0);

    for (Char c : ServerManager.getChars()) {
        if (c == null || c.isCleaned || c.user == null) continue;

      playerModel.addRow(new Object[]{
    c.id,
    c.name,
    c.user.session != null ? c.user.session.IPAddress : "unknown"
});

}
    }
private void kickSelectedPlayer() {
    int row = playerTable.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(frame, "Chưa chọn người chơi!");
        return;
    }

    int charId = (int) playerModel.getValueAt(row, 0);

    for (Char c : ServerManager.getChars()) {
        if (c != null && c.id == charId) {
            if (c.user != null) {
                c.user.session.disconnect();
            }
            Log.info("Kick player: " + c.name);
            break;
        }
    }

    loadPlayerTable();
}
private void blockSelectedIP() {
    int row = playerTable.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(frame, "Chưa chọn người chơi!");
        return;
    }

    String ip = (String) playerModel.getValueAt(row, 2);

    if (ip == null || ip.equals("unknown")) return;

    ServerManager.blockIP(ip); // nếu chưa có thì bạn tạo Set<String> blockedIPs
    Log.info("Blocked IP: " + ip);

    JOptionPane.showMessageDialog(frame, "Đã block IP: " + ip);
}

    private JPanel createSystemTab() {
        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(235, 235, 235));

        JButton btnStop = createButton("Bảo trì", 20, 20, "stop");
        JButton btnSave = createButton("Save All", 140, 20, "save");
        JButton btnClan = createButton("Lưu Gia Tộc", 260, 20, "clan");
        JButton btnRank = createButton("Refresh BXH", 380, 20, "rank");
        

        JButton btnPlayer = createButton("Lưu Người Chơi", 20, 60, "player");
        JButton btnCheck = createButton("Check Online", 140, 60, "CheckOnline");
        JButton btnReset = createButton("Reset DB", 260, 60, "resetdb");
JLabel lbExp = new JLabel("EXP:");
lbExp.setBounds(20, 100, 40, 25);
panel.add(lbExp);

JSpinner spExp = new JSpinner(
    new SpinnerNumberModel(
        Config.getInstance().getExpRate(),
        1, 1000, 1
    )
);
spExp.setBounds(60, 100, 80, 25);
panel.add(spExp);

JButton btnSaveExp = new JButton("Set EXP");
btnSaveExp.setBounds(150, 100, 100, 25);
panel.add(btnSaveExp);

btnSaveExp.addActionListener(e -> {
    int newRate = (int) spExp.getValue();
    Config.getInstance().expRate = newRate;
    Log.info("Admin set EXP Rate = x" + newRate);
    JOptionPane.showMessageDialog(frame, "EXP Rate = x" + newRate);
});

        panel.add(btnStop);
        panel.add(btnSave);
        panel.add(btnClan);
        panel.add(btnRank);
        panel.add(btnPlayer);
        panel.add(btnCheck);
        panel.add(btnReset);

        infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setBackground(Color.WHITE);
        infoArea.setBorder(BorderFactory.createTitledBorder("Thông tin server"));
        infoArea.setBounds(20, 136, 470, 160);

        panel.add(infoArea);

        return panel;
    }

    private JButton createButton(String text, int x, int y, String cmd) {
        JButton btn = new JButton(text);
        btn.setBounds(x, y, 110, 30);
        btn.setActionCommand(cmd);
        btn.addActionListener(this);
        return btn;
    }

    private void updateInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Thread: ").append(Thread.activeCount()).append("\n");
        info.append("Player online: ").append(ServerManager.getChars().size()).append("\n");
        info.append("User online: ").append(ServerManager.getUsers().size()).append("\n");
        info.append(DbManager.getInstance().getInfo());

        infoArea.setText(info.toString());
    }
private void unblockSelectedIP() {
    int row = playerTable.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(frame, "Chọn người chơi trước!");
        return;
    }

    String ip = (String) playerModel.getValueAt(row, 2); // cột IP

    if (ip == null || ip.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "IP không hợp lệ!");
        return;
    }

    ServerManager.unblockIP(ip);
    JOptionPane.showMessageDialog(frame, "Đã gỡ block IP: " + ip);
}

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "stop" -> {
                int confirm = JOptionPane.showConfirmDialog(
                        frame,
                        "Bạn có chắc muốn bảo trì server?",
                        "Xác nhận",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    Log.info("=== MAINTENANCE FROM PANEL ===");

                    Server.stop();
                    Server.maintance();

                    if (updateTimer != null) updateTimer.stop();
                    frame.dispose();
                }
            }

            case "save" -> {
                Log.info("Save from panel");
                Server.saveAll();
            }

            case "clan" -> {
                Log.info("Lưu dữ liệu gia tộc");
                List<Clan> clans = Clan.getClanDAO().getAll();
                synchronized (clans) {
                    for (Clan clan : clans) {
                        Clan.getClanDAO().update(clan);
                    }
                }
                Log.info("Lưu xong");
            }

            case "rank" -> {
                for (Char c : ServerManager.getChars()) {
                    c.saveData();
                }
                Ranked.refresh();
                Log.info("Đã refresh BXH");
            }

            case "player" -> {
                for (Char c : ServerManager.getChars()) {
                    if (c != null && !c.isCleaned) {
                        c.saveData();
                    }
                }
                Log.info("Lưu người chơi xong");
            }

            case "CheckOnline" -> {
                long count = ServerManager.getChars().stream()
                        .filter(c -> c != null && !c.isCleaned)
                        .count();
                Log.info("Số người online: " + count);
            }

            case "resetdb" -> DbManager.getInstance().start();
        }
    }
}
