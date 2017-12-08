/* Cemetary class that - derives from the Room class
 *                     - holds unique enemy spawn
 *                     - displays unique setting
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Cemetary extends Room {
    Cemetary(){
        //set values
        type = "Cemetary";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Zombie());
    }
    
    
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You wander into a cemetary.\n")
                   .append("Two dark figures approach.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("You have escaped the grave.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printYoRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
