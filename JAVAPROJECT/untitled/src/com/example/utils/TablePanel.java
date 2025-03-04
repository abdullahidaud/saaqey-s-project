package com.example.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablePanel {
    public JPanel createPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Name"}, 0);
        JTable table = new JTable(model);

        JButton addButton = new JButton("Add Row");
        addButton.addActionListener(e ->
                model.addRow(new Object[]{model.getRowCount() + 1, "User" + (model.getRowCount() + 1)}));

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.SOUTH);

        return panel;
    }
}
