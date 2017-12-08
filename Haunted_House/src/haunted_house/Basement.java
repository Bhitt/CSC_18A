/* Basement class that - derives from the Room class
 *                     - holds unique item spawn
 *                     - displays unique setting 
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Basement extends Room {
    
    Basement(){
        //set values
        type = "Basement";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Skeleton());
    }

    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("You enter into the basement.\n")
                   .append("Before you stands three skeletons!\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printVictory() {
        StringBuilder output = new StringBuilder();
            output.append("Congrats.\n")
                   .append("You escaped the dank basement!\n");
            JOptionPane.showMessageDialog(null, output);
    }

    @Override
    public void printYoRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
