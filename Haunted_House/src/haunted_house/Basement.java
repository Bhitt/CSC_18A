/* Basement class that - derives from the Room class
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
public class Basement extends Room {
    
    
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Basement(){
        //set values
        type = "Basement";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Skeleton());
    }
    
    //**********************************************************
    //             Room Greeting
    //**********************************************************
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You enter into the basement.\n")
                   .append("Before you stands three skeletons!\n");
            JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //             Victory String
    //**********************************************************
    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("Congrats.\n")
                   .append("You escaped the dank basement!\n");
            JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //             Ascii Title
    //**********************************************************
    @Override
    public void printYoRoom() {
                        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _            ____                                      _   \n" +
                                    " |__   __| |          |  _ \\                                    | |  \n" +
                                    "    | |  | |__   ___  | |_) | __ _ ___  ___ _ __ ___   ___ _ __ | |_ \n" +
                                    "    | |  | '_ \\ / _ \\ |  _ < / _` / __|/ _ \\ '_ ` _ \\ / _ \\ '_ \\| __|\n" +
                                    "    | |  | | | |  __/ | |_) | (_| \\__ \\  __/ | | | | |  __/ | | | |_ \n" +
                                    "    |_|  |_| |_|\\___| |____/ \\__,_|___/\\___|_| |_| |_|\\___|_| |_|\\__|\n" +
                                    "                                                                     \n" +
                                    "                                                                     ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.BLUE);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
