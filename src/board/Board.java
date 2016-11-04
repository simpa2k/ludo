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

        constructGridBoard();
        //constructBoard();
    }

    private void constructBoard() {

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

                position = new Position(Color.BLUE);
                row.add(position);

            }

            this.add(row);

        }
    }

    private void constructGridBoard() {
    
        setLayout(new GridLayout(3, 3));

        add(new Home(Color.BLUE));

        JPanel topSection = new JPanel();
        for (int i = 0; i < 3; i++) {

            position = new Position(Color.BLUE);
            topSection.add(position);

        }
        add(topSection);
        add(new Home(Color.BLUE));

        JPanel middleSection = new JPanel();
        for (int i = 0; i < 11; i++) {

            position = new Position(Color.BLUE);
            middleSection.add(position);

        }
        add(middleSection);
        add(new Home(Color.BLUE));

        JPanel bottomSection = new JPanel();
        for (int i = 0; i < 3; i++) {

            position = new Position(Color.BLUE);
            bottomSection.add(position);

        }
        add(bottomSection);
        add(new Home(Color.BLUE));
        
    }

}
