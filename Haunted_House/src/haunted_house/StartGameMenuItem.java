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
    
    
    //**********************************************************
    //                 Create a new Game
    //**********************************************************
    @Override
    public boolean doThing(){
        boolean isDead = false;
        //Grab the singleton Game instance and set the values to a new game
        Game.getInstance().setNewGame();
        //begin game function
        isDead = Game.getInstance().gameLoop();
        //return to main menu
        return false;
    }
    
    //**********************************************************
    //                 Print Start a New Game
    //**********************************************************
    @Override
    public String printYoSelf(){
        return "Start a New Game";
    }
    
    
}
