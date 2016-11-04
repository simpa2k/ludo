package gamePlan;

import place.Place;
import javax.swing.*;
import java.awt.*;

public class GamePlan extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final int HEIGHT = 11;
    private int width = 3;

    private Place place = new Place(Color.WHITE);

    public GamePlan(){

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        for (int y = 0; y < HEIGHT; y++) {

            JPanel row = new JPanel(); 

            boolean longRow = y > 3 && y < 7;

            if(longRow && width != 11) {
                width = 11;
            } else if(!longRow && width != 3) {
                width = 3;
            }
            
            for (int x = 0; x < width; x++) {

                place = new Place(Color.BLUE);
                row.add(place);

            }

            this.add(row);
        }
    }
}
