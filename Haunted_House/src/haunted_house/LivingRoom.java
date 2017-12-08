/* Living Room class that - derives from the Room class
 *                        - displays a unique setting
 * 
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class LivingRoom extends Room{

    LivingRoom(){
        //set values
        type = "Living Room";
        //print room greeting
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
