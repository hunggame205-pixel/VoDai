package com.beatdz.vdttplus.desktop;

import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MyDocumentListener implements DocumentListener {
    private final JLabel placeholderLabel;
    private final InputDialogHandler inputDialogHandler;

    public MyDocumentListener(JLabel var1, InputDialogHandler var2) {
        this.placeholderLabel = var1;
        this.inputDialogHandler = var2;
    }

    public void removeUpdate(DocumentEvent var1) {
        this.updated();
    }

    public void insertUpdate(DocumentEvent var1) {
        this.updated();
    }

    public void changedUpdate(DocumentEvent var1) {
        this.updated();
    }

    private void updated() {
        if (this.inputDialogHandler.textField.getText().length() == 0) {
            this.placeholderLabel.setVisible(true);
        } else {
            this.placeholderLabel.setVisible(false);
        }
    }
}

