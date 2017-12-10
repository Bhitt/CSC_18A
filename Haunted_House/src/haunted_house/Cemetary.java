/* Cemetary class that - derives from the Room class
 *                     - holds unique enemy spawn
 *                     - displays unique setting
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
public class Cemetary extends Room {
    
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Cemetary(){
        //set values
        type = "Cemetary";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Zombie());
    }
    
    //**********************************************************
    //             Room Greeting
    //**********************************************************    
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You wander into a cemetary.\n")
                   .append("Two dark figures approach.\n");
            JOptionPane.showMessageDialog(null, output);
    }
    
    //**********************************************************
    //             Victory string
    //**********************************************************
    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("You have escaped the grave.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //             Ascii Title
    //**********************************************************
    @Override
    public void printYoRoom() {
                StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _             _____                    _                   \n" +
                                    " |__   __| |           / ____|                  | |                  \n" +
                                    "    | |  | |__   ___  | |     ___ _ __ ___   ___| |_ __ _ _ __ _   _ \n" +
                                    "    | |  | '_ \\ / _ \\ | |    / _ \\ '_ ` _ \\ / _ \\ __/ _` | '__| | | |\n" +
                                    "    | |  | | | |  __/ | |___|  __/ | | | | |  __/ || (_| | |  | |_| |\n" +
                                    "    |_|  |_| |_|\\___|  \\_____\\___|_| |_| |_|\\___|\\__\\__,_|_|   \\__, |\n" +
                                    "                                                                __/ |\n" +
                                    "                                                               |___/ ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.MAGENTA);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
