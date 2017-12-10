/* Living Room class that - derives from the Room class
 *                        - displays a unique setting
 * 
 * 
 */

package haunted_house;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class LivingRoom extends Room{

    LivingRoom(){
        //set values
        type = "Living Room";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnRandomEnemy(3);
    }
    
    @Override
    public void printGreeting() {
        JOptionPane.showMessageDialog(null, "You walk into a mysterious living room.\n");
    }

    @Override
    public void printVictory() {
        JOptionPane.showMessageDialog(null, "You walk out of the mysterious living room.\n How mysterious.\n");
    }

    @Override
    public void printYoRoom() {
        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _            _      _       _               _____                       \n" +
                                    " |__   __| |          | |    (_)     (_)             |  __ \\                      \n" +
                                    "    | |  | |__   ___  | |     ___   ___ _ __   __ _  | |__) |___   ___  _ __ ___  \n" +
                                    "    | |  | '_ \\ / _ \\ | |    | \\ \\ / / | '_ \\ / _` | |  _  // _ \\ / _ \\| '_ ` _ \\ \n" +
                                    "    | |  | | | |  __/ | |____| |\\ V /| | | | | (_| | | | \\ \\ (_) | (_) | | | | | |\n" +
                                    "    |_|  |_| |_|\\___| |______|_| \\_/ |_|_| |_|\\__, | |_|  \\_\\___/ \\___/|_| |_| |_|\n" +
                                    "                                               __/ |                              \n" +
                                    "                                              |___/                               ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.ORANGE);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
