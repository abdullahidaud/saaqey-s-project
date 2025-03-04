package com.example.utils;

import javax.swing.*;
import java.awt.*;

public class InfoPanel {
    public JPanel createPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea infoArea = new JTextArea("Welcome to the Information Tab!\nHere is some static content.");
        infoArea.setEditable(false);
        panel.add(new JScrollPane(infoArea), BorderLayout.CENTER);
        return panel;
    }
}
