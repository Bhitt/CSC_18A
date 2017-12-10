/* Kitchen class that - derives from the Room class
 *                    - displays a unique setting
 *                    - holds unique enemy spawn
 * 
 */

package haunted_house;
//library imports
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class Kitchen extends Room{

    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Kitchen(){
        //set values
        type = "Kitchen";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnRandomEnemy(1);
    }
    
    //**********************************************************
    //             Room Greeting
    //**********************************************************    
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You walk into a Kitchen.\n")
                   .append("How dangerous can it be.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //             Victory String
    //**********************************************************
    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("You'll be back for some midnight snacks.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //             Ascii Title
    //**********************************************************
    @Override
    public void printYoRoom() {
        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _            _  ___ _       _                \n" +
                                    " |__   __| |          | |/ (_) |     | |               \n" +
                                    "    | |  | |__   ___  | ' / _| |_ ___| |__   ___ _ __  \n" +
                                    "    | |  | '_ \\ / _ \\ |  < | | __/ __| '_ \\ / _ \\ '_ \\ \n" +
                                    "    | |  | | | |  __/ | . \\| | || (__| | | |  __/ | | |\n" +
                                    "    |_|  |_| |_|\\___| |_|\\_\\_|\\__\\___|_| |_|\\___|_| |_|\n" +
                                    "                                                       \n" +
                                    "                                                       ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.YELLOW);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
