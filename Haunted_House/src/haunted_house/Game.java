/* Game class that  - implements the actions of the game
 *                  - display story
 *                  - saves states
 *
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class Game {
    private Player player;
    public static Game _instance;
    
    private Game(){
        //create the player
        player = new Player();
    }
    
    //second constructor to load in a previous game
    
    public static Game getInstance(){
        if(_instance != null){
            return _instance;
        }else{
            _instance = new Game();
            return _instance;
        }
    }
    
    public void spawnRoom(){
        
    }
    
    public void spawnEnemy(){
        
    }
    
}
