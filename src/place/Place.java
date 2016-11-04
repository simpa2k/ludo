package place; 

import javax.swing.*;
import java.awt.*;

import gamePiece.GamePiece;

public class Place extends JComponent {

    private static final long serialVersionUID = 1L;

    private Color color;
    private GamePiece gamePiece;

    public Place(Color color) {
        this.color = color;
        this.setPreferredSize(new Dimension(50,50));
        this.setMinimumSize(new Dimension(50,50));
        this.setVisible(true);
    }

    public void paintComponent(Graphics g){
        g.setColor(color);
        g.fillOval(10,10,40,40);
    }
}
