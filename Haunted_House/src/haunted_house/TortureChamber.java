/* TortureChamber class that - derives from the Room class
 *                           - displays a unique setting
 *                           - holds unique enemy spawn
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
 * 
 */
public class TortureChamber extends Room {

    //**********************************************************
    //             Default Constructor
    //**********************************************************
    TortureChamber(){
        //set values
        type = "Torture Chamber";
        //print room greeting
        printYoRoom();
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleslime());
    }

    //**********************************************************
    //             Room Greeting
    //**********************************************************    
    @Override
    public void printGreeting() {
        JOptionPane.showMessageDialog(null, "You stumble into the Torture Chamber...\n What hideous cruelty lies within?...\n");
    }

    //**********************************************************
    //             Victory String
    //**********************************************************
    @Override
    public void printVictory() {
        JOptionPane.showMessageDialog(null, "You have bested the giant gellatanous jelly!");
    }

    //**********************************************************
    //             Ascii Title
    //**********************************************************    
    @Override
    public void printYoRoom() {
        StringBuilder output = new StringBuilder();
                    output.append(  "  _______ _            _______         _                     _____ _                     _               \n" +
                                    " |__   __| |          |__   __|       | |                   / ____| |                   | |              \n" +
                                    "    | |  | |__   ___     | | ___  _ __| |_ _   _ _ __ ___  | |    | |__   __ _ _ __ ___ | |__   ___ _ __ \n" +
                                    "    | |  | '_ \\ / _ \\    | |/ _ \\| '__| __| | | | '__/ _ \\ | |    | '_ \\ / _` | '_ ` _ \\| '_ \\ / _ \\ '__|\n" +
                                    "    | |  | | | |  __/    | | (_) | |  | |_| |_| | | |  __/ | |____| | | | (_| | | | | | | |_) |  __/ |   \n" +
                                    "    |_|  |_| |_|\\___|    |_|\\___/|_|   \\__|\\__,_|_|  \\___|  \\_____|_| |_|\\__,_|_| |_| |_|_.__/ \\___|_|   \n" +
                                    "                                                                                                         \n" +
                                    "                                                                                                         ");
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setBackground(Color.BLACK);
        tArea.setForeground(Color.RED);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        tArea.setText(output.toString());
        JOptionPane.showMessageDialog(null, tArea, "The Garden", JOptionPane.PLAIN_MESSAGE);
    }
    
}
