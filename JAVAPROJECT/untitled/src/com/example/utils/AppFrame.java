package com.example.utils;

import javax.swing.*;

public class AppFrame {
    private JFrame frame;
    private JTabbedPane tabbedPane;

    public AppFrame() {
        frame = new JFrame("Tabbed Application");
        tabbedPane = new JTabbedPane();

        tabbedPane.add("Form", new FormPanel().createPanel());
        tabbedPane.add("Table", new TablePanel().createPanel());
        tabbedPane.add("Info", new InfoPanel().createPanel());
        tabbedPane.add("Reflection", new ReflectionPanel().createPanel());
        tabbedPane.add("Actions", new ActionPanel().createPanel());

        frame.add(tabbedPane);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
