/* StartGameMenuItem class that - derives from MenuItem
 *                              - launches a new game
 *                              - launches an existing game from a loaded file
 * 
 */

package haunted_house;

/**
 *
 */
public class StartGameMenuItem extends MenuItem{
    
    public StartGameMenuItem(){
    }
    
    @Override
    public boolean doThing(){
        boolean isDead = false;
        //Grab the singleton Game instance and set the values to a new game
        Game.getInstance().setNewGame();
        //begin game loop
        isDead = Game.getInstance().gameLoop();
        //if player died 
        
            //give output showing tombstone
            
            //also update the highscores list
        
        //return to main menu
        return false;
    }
    
    @Override
    public String printYoSelf(){
        return "Start a New Game";
    }
    
    
}
