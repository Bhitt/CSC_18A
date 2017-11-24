/* LoadGameMenuItem class that - derives from the MenuItem class
 *                             - loads a file with a saved game state
 *                             - 
 * 
 */

package haunted_house;

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
        System.out.println("You loaded a game");
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
