package com.example.utils;

import javax.swing.*;
import java.awt.*;

public class FormPanel {
    public JPanel createPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JTextField nameField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e ->
                JOptionPane.showMessageDialog(panel, "Entered: " + nameField.getText()));

        panel.add(new JLabel("Enter Name:"));
        panel.add(nameField);
        panel.add(submitButton);

        return panel;
    }
}
