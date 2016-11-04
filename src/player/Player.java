package player;

import gamePiece.GamePiece;

import java.awt.*;

/**
 * Created by Robert on 2016-11-04.
 */
public class Player {

    private Color color;
    GamePiece[] gamePieceArray = new GamePiece[4];

    public Player() {
        for (int i = 0; i < gamePieceArray.length; i++) {
            gamePieceArray[i] = new GamePiece(color);
        }
    }



}
