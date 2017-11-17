/* Player class that    - implements a player for the game
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
    
    
    
    public Player(){
        this.maxHealth = 100;
        this.currentHealth = 100;
        this.attackVal = 10;
        this.hitChance = 70;
        
        this.name = JOptionPane.showInputDialog("What shall we write on your gravestone:");
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
