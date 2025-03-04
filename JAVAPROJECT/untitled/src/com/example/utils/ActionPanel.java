package com.example.utils;

import javax.swing.*;
import java.awt.*;

public class ActionPanel {
    public JPanel createPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JButton alertButton = new JButton("Show Alert");
        alertButton.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Action performed!"));
        panel.add(alertButton);
        return panel;
    }
}
