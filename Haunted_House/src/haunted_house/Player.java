/* Player class that    - implements a singleton player object for the game
 *                      - contains a value for name
 *                      - contains a value for max health
 *                      - contains a value for current health
 *                      - contains a value for the player's attack
 *                      - setters/getters for the above
 */

package haunted_house;

import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Player {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int attackVal;
    private int hitChance;
    public static Player _instance;
    
    
    
    private Player(){
        this.maxHealth = 100;
        this.currentHealth = 100;
        this.attackVal = 10;
        this.hitChance = 70;
        this.name = "John Doe";
        //this.name = JOptionPane.showInputDialog("What shall it read on your gravestone?");
    }

    
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

    public void promptName(){
        this.name = JOptionPane.showInputDialog("What shall it read on your gravestone?");
        
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getMaxHealth() {
        return maxHealth;
    }


    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }


    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }


    public int getAttackVal() {
        return attackVal;
    }


    public void setAttackVal(int attackVal) {
        this.attackVal = attackVal;
    }
    
    
}
