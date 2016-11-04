package main;
/**
 * Created by Maja on 2016-11-01.
 */

import window.GamePlan;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GamePlan gamePlan = new GamePlan();
                gamePlan.setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
                gamePlan.setBounds(50, 50, 700, 700);
                gamePlan.setVisible(true);
            }

        });
    }
}
