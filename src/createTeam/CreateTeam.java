package createTeam;

import javax.swing.*;
import java.awt.*;
import player.Player;

/**
 * Created by Maja on 2016-11-25.
 */
public class CreateTeam extends JPanel{

    private String[] numberOfplayers = {"","1", "2", "3", "4"};
    private String[] colors = {"", "Blue", "Red", "Green", "Yellow"};
    private JLabel[] labels = new JLabel[4];
    private JComboBox[] comboBoxes = new JComboBox[4];
    private int counter;


    private JLabel test = new JLabel("Test");

    public CreateTeam() {

        setPreferredSize(new Dimension(200,220));

        JComboBox<String> choosePlayers = new JComboBox<String>(numberOfplayers);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        choosePlayers.setMaximumSize(new Dimension(700,25));
        this.add(new JLabel("How many players?"));
        this.add(choosePlayers);

        choosePlayers.addActionListener(event -> {

                    try {
                        int amountOfPlayers = Integer.parseInt((String) choosePlayers.getSelectedItem());

                        if (amountOfPlayers < counter) {
                            int j = counter;
                            for (int i = amountOfPlayers; i < j; i++) {
                                if (labels[i] != null) {
                                    remove(labels[i]);
                                    remove(comboBoxes[i]);
                                    counter--;
                                }
                            }
                        } else {
                            for (int i = counter; i < amountOfPlayers; i++) {
                                newPlayer(i);
                            }
                        }

                    }catch(NumberFormatException e){
                        int counterNumber = counter;
                        for (int i = 0; i < counterNumber; i++) {
                            if (labels[i] != null) {
                                remove(labels[i]);
                                remove(comboBoxes[i]);
                                counter--;
                            }
                        }
                    }
                    updateUI();
                }
        );
        setVisible(true);
    }

    private void newPlayer(int player){
        JLabel newLabel = new JLabel("Player " + (player+1));
        JComboBox<String> newComboBox = new JComboBox<String>(colors);
        newComboBox.setMaximumSize(new Dimension(700,25));

        this.add(newLabel);
        this.add(newComboBox);
        labels[player] = newLabel;
        comboBoxes[player] = newComboBox;
        counter++;
    }

    public Player[] addPlayers(){

        Player[] newPlayers = new Player[4];

        for(int i = 0; i<counter; i++) {
            Player newPlayer = new Player(getColor(i));
            newPlayers[i] = newPlayer;
        }
        return newPlayers;
    }

    private Color getColor(int comboBox){

        String color = (String) comboBoxes[comboBox].getSelectedItem();

        switch (color){
            case "Blue":
                return Color.blue;
            case "Red":
                return Color.red;
            case "Green":
                return Color.green;
            case "Yellow":
                return Color.yellow;
            default:
                return null;
        }
    }
}
