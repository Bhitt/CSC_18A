/* Game class that  - implements the actions of the game
 *                  - display story
 *                  - saves states
 *
 */

package haunted_house;


import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Game {
    //Game property
    public static Game _instance = null;
    
    //**********************************************************
    //      Default Constructor for singleton game object
    //**********************************************************
    private Game(){

    }
    
    //**********************************************************
    //             Set up for a new Game
    //**********************************************************
    public void setNewGame(){
        //create a new character
        Player.getInstance().promptName();
        //output the stats chosen
        showStats();
    }
    
    //**********************************************************
    //              Load a previous save game
    //**********************************************************
    public void loadGame(){
        //optional method
        
    }
    
    //**********************************************************
    //           Game loop that runs through game actions
    //**********************************************************
    public boolean gameLoop(){
        boolean exit = false;
        //continue the loop until gameplay is ended (death or exitting)
        do{
            //enter into a room (build it)
    
            //spawn enemies
        
            //loop through enemies for fight
            
            //give rewards if alive
        
            //check for save point if alive
        
            //check for death
            
            
            //temporary exit assignment
            exit = true;
        }while(!exit);
        //return true for death or false for alive and exiting through save
        return true;
    }
    
    //**********************************************************
    //           Test function for testing purposes
    //**********************************************************
    public void testFunction(){
    //
        System.out.println("This is a test");
    }
    
    //**********************************************************
    //            Maintains game object as a singleton
    //**********************************************************
    public static Game getInstance(){
        if(_instance != null){
            //System.out.println("Game instance found");
            return _instance;
        }else{
            _instance = new Game();
            //System.out.println("Game instance created");
            return _instance;
        }
    }
    
    //**********************************************************
    //             Show the current game stats
    //**********************************************************
    public void showStats(){
        StringBuilder output = new StringBuilder();
        output.append(Player.getInstance().getName()).append("\n" )
              .append("Current HP: ").append(Player.getInstance().getCurrentHealth()).append("\n")
              .append("Attack Power: ").append(Player.getInstance().getAttackVal()).append("\n")
              .append("Rooms Cleared: ").append(Player.getInstance().getRoomsCleared());
        JOptionPane.showMessageDialog(null, output, "Player Status", JOptionPane.PLAIN_MESSAGE);
    }
    
    //**********************************************************
    //             Spawn a Room
    //**********************************************************
    public void spawnRoom(){
        
    }
    
    //**********************************************************
    //             Spawn an Enemy
    //**********************************************************
    public void spawnEnemy(){
        
    }
    
    
    ///
}
