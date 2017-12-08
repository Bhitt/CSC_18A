/* TortureChamber class that - derives from the Room class
 *                           - displays a unique setting
 *                           - holds unique enemy spawn
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class TortureChamber extends Room {

    TortureChamber(){
        //set values
        type = "Torture Chamber";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleslime());
    }
    
    @Override
    public void printGreeting() {
        JOptionPane.showMessageDialog(null, "You stumble into the Torture Chamber...\n What hideous cruelty lies within?...\n");
    }

    @Override
    public void printVictory() {
        JOptionPane.showMessageDialog(null, "You have bested the giant gellatanous jelly!");
    }

    @Override
    public void printYoRoom() {
        
    }
    
}
