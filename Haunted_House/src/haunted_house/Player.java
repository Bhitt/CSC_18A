/* Player class that    - implements a singleton player object for the game
 *                      - contains a value for name
 *                      - contains a value for max health
 *                      - contains a value for current health
 *                      - contains a value for the player's attack
 *                      - setters/getters for the above
 */

package haunted_house;

//library imports
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Player {
    //Player properties
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int attackVal;
    private int hitChance;
    private int roomsCleared;
    public static Player _instance;
    
    
    //**********************************************************
    //       Default Constructor for singleton Player object
    //**********************************************************
    private Player(){
        this.maxHealth = 100;
        this.currentHealth = 100;
        this.attackVal = 10;
        this.hitChance = 70;
        this.roomsCleared = 0;
        this.name = "John Doe";
    }

    //**********************************************************
    //           Maintains player as singleton object
    //**********************************************************
    public static Player getInstance(){
        if(_instance != null){
            //System.out.println("Found player instance");
            return _instance;
        } else {
            _instance = new Player();
            //System.out.println("Created new player instance");
            return _instance;
        }
    }
    
    //**********************************************************
    //                Accessor for Player name
    //**********************************************************
    public String getName() {
        return name;
    }

    //**********************************************************
    //                Mutator for Player name
    //**********************************************************
    public void setName(String name) {
        this.name = name;
    }

    //**********************************************************
    //                Accessor for Player max health
    //**********************************************************
    public int getMaxHealth() {
        return maxHealth;
    }

    //**********************************************************
    //                Mutator for Player max health 
    //**********************************************************
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    //**********************************************************
    //                Accessor for Player current health
    //**********************************************************
    public int getCurrentHealth() {
        return currentHealth;
    }

    //**********************************************************
    //               Mutator for Player current health 
    //**********************************************************
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    //**********************************************************
    //               Accessor for Player attack value
    //**********************************************************
    public int getAttackVal() {
        return attackVal;
    }

    //**********************************************************
    //               Mutator for Player attack value
    //**********************************************************
    public void setAttackVal(int attackVal) {
        this.attackVal = attackVal;
    }
    
    //**********************************************************
    //               Accessor for Player attack value
    //**********************************************************
    public int getRoomsCleared() {
        return roomsCleared;
    }

    //**********************************************************
    //               Mutator for Player attack value
    //**********************************************************
    public void setRoomsCleared(int roomsCleared) {
        this.roomsCleared = roomsCleared;
    }
    
    //**********************************************************
    //              Prompt the user to set a player name
    //**********************************************************
    public void promptName(){
        //dummy dialog made to keep input window on top
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);   
        this.name = JOptionPane.showInputDialog(dialog,"What shall it read on your gravestone?");
        dialog.dispose();
    }
}
