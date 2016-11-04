package window;

/**
 * Created by Maja on 2016-11-01.
 */

import place.Place;
import javax.swing.*;
import java.awt.*;

public class GamePlan extends JFrame {

    private Place place = new Place(Color.WHITE);
    private JPanel mainPanel = new JPanel();

    public GamePlan() {
       // mainPanel.setLayout(new GridLayout(7, 3));


        for(int i = 0; i < 3; i++){
                place = new Place(Color.BLUE);
                 mainPanel.add(place);
            }

        add(mainPanel, BorderLayout.CENTER);
    }


}  
