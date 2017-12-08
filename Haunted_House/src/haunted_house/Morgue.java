/* Morgue class that - derives from the Room class
 *                   - displays a unique setting
 * 
 * 
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Morgue extends Room {

    Morgue(){
        //set values
        type = "Morgue";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Zombie());
        Game.getInstance().spawnEnemy(new Skeleton());
        Game.getInstance().spawnEnemy(new Zombie());
    }
    
    @Override
    public void printGreeting() {
        JOptionPane.showMessageDialog(null, "A horrible stench slams into your face as you enter\ninto the Morgue.\n");
    }

    @Override
    public void printVictory() {
        JOptionPane.showMessageDialog(null, "You barely escape the rotting flesh that surrounded you.\n");
    }

    @Override
    public void printYoRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
