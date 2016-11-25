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

    public int move(int step){
        position = position + step;
        return position; //if(position>40) {remove GamePiece)}
    }

    public void resetPosition(){
        position = 0;
    }

    public Color getColor(){
        return color;
    }
}
