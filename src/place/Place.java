package place;

import javax.swing.*;
import java.awt.*;

public abstract class Place extends JComponent {

    private static final long serialVersionUID = 1L;

    private Color color;

    private int diameter = 50;

    public Place(Color color) {
        this.color = color;
        this.setPreferredSize(new Dimension(diameter, diameter));
        this.setMinimumSize(new Dimension(diameter, diameter));
        this.setVisible(true);
    }

    public void paintComponent(Graphics g){
        g.setColor(color);
        //g.fillOval(10,10,40,40);
        g.fillOval(0,0,diameter,diameter);
    }

    protected void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    protected int getDiameter() {
        return diameter;
    }

    public abstract void setGamePiece();
}
