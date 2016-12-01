package window;

import CreateTeam.CreateTeam;
import board.Board;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel gamePlan = new Board();
    private JPanel createTeam = new CreateTeam();

    public Window() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateTeam createTeam = new CreateTeam();
        int newTeams = JOptionPane.showConfirmDialog(Window.this, createTeam, "Create Team",
                JOptionPane.OK_CANCEL_OPTION);
        if(newTeams == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }

        add(gamePlan, BorderLayout.CENTER);
       // add(createTeam, BorderLayout.CENTER);





    }


}  
