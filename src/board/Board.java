package board;

import place.*;
import player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final int HEIGHT = 11;
    private int width = 3;
    private ArrayList<Player> players = new ArrayList<>();

    private Position position = new Position(Color.WHITE);

    public Board(){

        constructBoard();

    }


    private void addPositions(int width, int height, int x, int y, Color color) {

        for (int row = y; row < y + height; row++) {
            
            for (int column = x; column < x + width; column++) {

                GridBagConstraints c = new GridBagConstraints();

                c.gridx = column;
                c.gridy = row;

                Position position = new Position(color);
                add(position, c);

            }

        }
        
    }

    private void addHome(Home home, int x, int y) {

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = x;
        c.gridy = y;

        c.gridwidth = 4;
        c.gridheight = 4;

        add(home, c);

    }

    private void constructBoard() {
        
        setLayout(new GridBagLayout());

        addHome(new Home(Color.BLUE), 0, 0);
        addPositions(3, 4, 4, 0, Color.BLUE);
        addHome(new Home(Color.RED), 8, 0);

        addPositions(11, 3, 0, 4, Color.BLUE);

        addHome(new Home(Color.YELLOW), 0, 7);
        addPositions(3, 4, 4, 7, Color.BLUE);
        addHome(new Home(Color.GREEN), 8, 7);


    }

}
