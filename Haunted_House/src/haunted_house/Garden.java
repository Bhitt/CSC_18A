/* Garden class that - derives from the Room class
 *                   - holds unique enemy spawn
 *                   - displays unique setting
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
public class Garden extends Room{
    
    //**********************************************************
    //      Default Constructor 
    //**********************************************************
    Garden(){
        //set values
        type = "Garden";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
    }

    //**********************************************************
    //      Print Victory Statement 
    //**********************************************************
    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("Jynkysss, you have defeated my swarm of Bees, how could you!!!!!!\n");
        JOptionPane.showMessageDialog(null, output);
    }

    //**********************************************************
    //      Print Room Picture to Screen 
    //**********************************************************
    @Override
    public void printYoRoom() {
        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _             _____               _            \n" +
                                    " |__   __| |           / ____|             | |           \n" +
                                    "    | |  | |__   ___  | |  __  __ _ _ __ __| | ___ _ __  \n" +
                                    "    | |  | '_ \\ / _ \\ | | |_ |/ _` | '__/ _` |/ _ \\ '_ \\ \n" +
                                    "    | |  | | | |  __/ | |__| | (_| | | | (_| |  __/ | | |\n" +
                                    "    |_|  |_| |_|\\___|  \\_____|\\__,_|_|  \\__,_|\\___|_| |_|\n" +
                                    "                                                         \n" +
                                    "                                                         ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.GREEN);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
    //**********************************************************
    //      Display text for greeting
    //**********************************************************
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("Hello and Goodbye you foool, you have steped into the garden.\n")
                   .append("Now me and my beees shall be able to cut you into pieces.\n")
                   .append("I only have one question: how many years have you poisone the world with that ugly face?");
        JOptionPane.showMessageDialog(null, output);
    }
}
