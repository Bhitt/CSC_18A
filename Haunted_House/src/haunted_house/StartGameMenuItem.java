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
    
    
    @Override
    public boolean doThing(){
        //Test string
        System.out.println("You started a new game");
        
        return false;
    }
    
    @Override
    public String printYoSelf(){
        return "Start a New Game";
    }
}
