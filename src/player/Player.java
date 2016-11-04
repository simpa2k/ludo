package player;

import gamePiece.GamePiece;

/**
 * Created by Robert on 2016-11-04.
 */
public class Player {

    GamePiece[] gamePieceArray = new GamePiece[4];

    public Player() {
        for (int i = 0; i < gamePieceArray.length; i++) {
            gamePieceArray[i] = new GamePiece();
        }
    }

}
