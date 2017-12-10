/* Morgue class that - derives from the Room class
 *                   - displays a unique setting
 *                   - holds unique enemy spawns
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
public class Morgue extends Room {
    
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Morgue(){
        //set values
        type = "Morgue";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Zombie());
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Zombie());
    }
    
    //**********************************************************
    //             Room Greeting
    //**********************************************************    
    @Override
    public void printGreeting() {
        JOptionPane.showMessageDialog(null, "A horrible stench slams into your face as you enter\ninto the Morgue.\n");
    }

    //**********************************************************
    //             Victory String
    //**********************************************************
    @Override
    public void printVictory() {
        JOptionPane.showMessageDialog(null, "You barely escape the rotting flesh that surrounded you.\n");
    }

    //**********************************************************
    //             Ascii Title
    //**********************************************************
    @Override
    public void printYoRoom() {
        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _            __  __                            \n" +
                                    " |__   __| |          |  \\/  |                           \n" +
                                    "    | |  | |__   ___  | \\  / | ___  _ __ __ _ _   _  ___ \n" +
                                    "    | |  | '_ \\ / _ \\ | |\\/| |/ _ \\| '__/ _` | | | |/ _ \\\n" +
                                    "    | |  | | | |  __/ | |  | | (_) | | | (_| | |_| |  __/\n" +
                                    "    |_|  |_| |_|\\___| |_|  |_|\\___/|_|  \\__, |\\__,_|\\___|\n" +
                                    "                                         __/ |           \n" +
                                    "                                        |___/            ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.CYAN);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
