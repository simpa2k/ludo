package board;

import place.*;
import player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final double WIDTH = 11.0;

    private static int homeWidth;
    private static int crossWidth;

    private ArrayList<Player> players = new ArrayList<>();
    private Position position = new Position(Color.WHITE);
    private Color[] colors = {Color.blue, Color.RED, Color.YELLOW, Color.GREEN};

    public Board() {

        homeWidth = calculateHomeWidth();
        crossWidth = (int) WIDTH - (homeWidth * 2);

        constructBoard();

    }

    private int calculateHomeWidth() {
        
        double moduloThree = WIDTH % 3.0;
        double nearestNumberDivisibleByThree = WIDTH - moduloThree;
        double moduloDividedByTwo = moduloThree / 2.0;

        return (int) ( ( nearestNumberDivisibleByThree / 3.0 ) + Math.ceil(moduloDividedByTwo) );

    }

    private void addPositions(int width, int height, int x, int y) {

        for (int row = y; row < y + height; row++) {
            
            for (int column = x; column < x + width; column++) {

                GridBagConstraints c = new GridBagConstraints();

                c.gridx = column;
                c.gridy = row;

                Color positionColor = colors[( column + row ) % colors.length];
                Position position = new Position(positionColor);

                add(position, c);

            }

        }
        
    }

    private void addHome(Home home, int x, int y) {

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = x;
        c.gridy = y;

        c.gridwidth = homeWidth;
        c.gridheight = homeWidth;

        add(home, c);

    }

    private void constructBoard() {
        
        setLayout(new GridBagLayout());

        addHome(new Home(Color.BLUE), 0, 0);
        addPositions(crossWidth, 4, homeWidth, 0);
        addHome(new Home(Color.RED), crossWidth + homeWidth + 1, 0);

        addPositions((int) WIDTH, 3, 0, 4);

        addHome(new Home(Color.YELLOW), 0, 7);
        addPositions(crossWidth, 4, homeWidth, 7);
        addHome(new Home(Color.GREEN), crossWidth + homeWidth + 1, 7);

    }

}
