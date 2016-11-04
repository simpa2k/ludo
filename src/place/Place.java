package place; 

/**
 * Created by Maja on 2016-11-01.
 */

import javax.swing.*;
import java.awt.*;

public class Place extends JComponent {

    private static final long serialVersionUID = 1L;

    private Color color;

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
