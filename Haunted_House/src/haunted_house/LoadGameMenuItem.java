/* LoadGameMenuItem class that - derives from the MenuItem class
 *                             - loads a file with a saved game state (future addition)
 *                             - outputs a string to let player know there is no saving currently
 * 
 */

package haunted_house;
//import JOptionPane for dialog use
import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class LoadGameMenuItem extends MenuItem{
   
    
    //**********************************************************
    //             Perform the load game action
    //**********************************************************
    @Override
    public boolean doThing(){
         //Test string
        StringBuilder output = new StringBuilder();
            output.append("You fool! This is a roguelike game, there are no saves.\n")
                   .append("Every death is permanent!\n");
        JOptionPane.showMessageDialog(null, output);
        return false;
    }
    
    //**********************************************************
    //             Display load game action to user
    //**********************************************************
    @Override
    public String printYoSelf(){
        return "Load a Game from a saved file";
    }
}
