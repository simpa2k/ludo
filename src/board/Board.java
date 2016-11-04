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

    private Place place = new Place(Color.WHITE);

    public Board(){

        //constructGridBagBoard();
        constructBoard();
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

                place = new Place(Color.BLUE);
                row.add(place);

            }

            this.add(row);

        }
    }

    private void constructGridBagBoard() {

        players.add(new Player());
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());

        setLayout(new GridBagLayout());
        
        /*for (int y = 0; y < players.size() / 2; y++) {

            for (int x = 0; x < players.size() / 2; x++) {

                GridBagConstraints c = new GridBagConstraints();

                c.weightx = 1.0;
                c.weighty = 1.0;

                c.gridy = y;
                c.gridx = x;

                c.gridheight = 4;
                c.gridwidth = 4;
                c.fill = GridBagConstraints.BOTH;
                c.ipady = 40;

                Home home = new Home(Color.BLUE);

                System.out.println(x + ", " + y);

                this.add(home);
            }
            
        }*/
        
    }

}
