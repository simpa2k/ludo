package window;

import gamePlan.GamePlan;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel gamePlan = new GamePlan();

    public Window() {
       add(gamePlan, BorderLayout.CENTER);
    }


}  
