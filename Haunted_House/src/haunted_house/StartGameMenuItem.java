/* StartGameMenuItem class that - derives from MenuItem
 *                              - launches a new game
 *                              - launches an existing game from a loaded file
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class StartGameMenuItem extends MenuItem{
    
    
    public StartGameMenuItem(){
        
    }
    
    @Override
    public boolean doThing(){
        //Grab the singleton Game instance and set the values to a new game
        Game.getInstance().setNewGame();
        
        //begin game loop
        
        //output final stats after death
        
        //return false to return to the main menu
        return false;
    }
    
    @Override
    public String printYoSelf(){
        return "Start a New Game";
    }
}
