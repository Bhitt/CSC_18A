/* Kitchen class that - derives from the Room class
 *                    - displays a unique setting
 * 
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Kitchen extends Room{

    Kitchen(){
        //set values
        type = "Kitchen";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnRandomEnemy(1);
    }
    
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You walk into a Kitchen.\n")
                   .append("How dangerous can it be.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("You'll be back for some midnight snacks.\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printYoRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
