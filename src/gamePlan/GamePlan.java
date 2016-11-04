package gamePlan;

import place.Place;
import javax.swing.*;
import java.awt.*;

public class GamePlan extends JPanel {

    private static final long serialVersionUID = 1L;

    private Place place = new Place(Color.WHITE);

    public GamePlan(){

        for(int i = 0; i < 3; i++){
            place = new Place(Color.BLUE);
            this.add(place);
        }
    }
}
