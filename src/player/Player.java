package player;

import com.sun.deploy.util.ArrayUtil;
import gamePiece.GamePiece;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by Robert on 2016-11-04.
 */
public class Player {

    private Color color;
    private GamePiece[] gamePieceArray = new GamePiece[4];

    public Player(Color color) {
        this.color = color;
        for (int i = 0; i < gamePieceArray.length; i++) {
            gamePieceArray[i] = new GamePiece(color);
        }
    }

    public String toString(){

        if(color == Color.blue){
            return String.format("Blue");
        }else if(color == Color.red){
            return String.format("Red");
        }else if(color == Color.green){
            return String.format("Green");
        }
        else if(color == Color.yellow){
            return String.format("Yellow");
        }
        return null;

    }

    public Color getColor(){
        return color;
    }

  /*  public void move(int positionGamePiece){
        GamePiece g = new GamePiece(color); //den valda gamepiecen)

        if(positionGamePiece > 40){
            if(Arrays.asList(gamePieceArray).contains(g)){
               gamePieceArray.remove(g);

            }

        }
    }*/



}
