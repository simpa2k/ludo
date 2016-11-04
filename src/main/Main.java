package main;

import window.Window;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window window = new Window();
                window.setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
                window.setBounds(50, 50, 700, 700);
                window.setVisible(true);
            }
        });
    }
}
