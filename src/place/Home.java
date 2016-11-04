package place;

import java.awt.Color;
import java.awt.Dimension;

public class Home extends Place {

    private static final long serialVersionUID = 1L;

    public Home(Color color) {
        super(color);

        int diameter = getDiameter() * 2;
        setPreferredSize(new Dimension(diameter, diameter));

    }

    public void setGamePiece(){
    }

}
