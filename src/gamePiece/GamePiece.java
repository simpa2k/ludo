package gamePiece;

import javax.swing.*;
import java.awt.Color;

public class GamePiece {

    public static final long serialVersionUID = 1L;

    private Color color;
    private int position = 0;

    public GamePiece(Color color) {
        this.color = color;
    }

    public void move(int step){
        position = position + step;
    }

    public Color getColor(){
        return color;
    }



}
