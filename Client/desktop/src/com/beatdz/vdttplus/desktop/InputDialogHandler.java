package com.beatdz.vdttplus.desktop;

import com.badlogic.gdx.Input.TextInputListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class InputDialogHandler implements Runnable {
    private final String text;
    private final String title;
    private JDialog dialog;
    private final String hint;
    private final TextInputListener listener;
    private JLabel placeholderLabel;
    JTextField textField;

    public InputDialogHandler(String var1, String var2, JDialog var3, String var4, TextInputListener var5) {
        this.text = var1;
        this.title = var2;
        this.dialog = var3;
        this.hint = var4;
        this.listener = var5;
    }

    public void run() {
        JPanel var1 = new JPanel(new FlowLayout());
        JPanel var2;
        (var2 = new JPanel()).setLayout(new OverlayLayout(var2));
        var1.add(var2);
        this.textField = new JTextField(20);
        this.textField.setText(this.text);
        this.textField.setAlignmentX(0.0F);
        var2.add(this.textField);
        this.placeholderLabel = new JLabel(this.hint);
        this.placeholderLabel.setForeground(Color.GRAY);
        this.placeholderLabel.setAlignmentX(0.0F);
        var2.add(this.placeholderLabel, 0);
        this.textField.getDocument().addDocumentListener(new MyDocumentListener(this.placeholderLabel, this));
        JOptionPane var3;
        (var3 = new JOptionPane(var1, 3, 2, (Icon)null, (Object[])null, (Object)null)).setInitialValue((Object)null);
        var3.setComponentOrientation(JOptionPane.getRootFrame().getComponentOrientation());
        Border var5 = this.textField.getBorder();
        this.placeholderLabel.setBorder(new EmptyBorder(var5.getBorderInsets(this.textField)));
        this.dialog = var3.createDialog((Component)null, this.title);
        this.dialog.setAlwaysOnTop(true);
        var3.selectInitialValue();
        this.dialog.setVisible(true);
        this.dialog.dispose();
        Object var4;
        if ((var4 = var3.getValue()) != null && var4 instanceof Integer && (Integer)var4 == 0) {
            this.listener.input(this.textField.getText());
        } else {
            this.listener.canceled();
        }
    }
}

