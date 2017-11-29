/* Zombie class that - derives from the Enemy class
 *                   - has unique stats
 *                   - displays an ascii picture of itself
 * 
 */

package haunted_house;

/**
 *
 * 
 */
public class Zombie extends Enemy{
   String type;
    Integer health;
    Integer attackValue;
    
    @Override
    public String printYoSelf(){
       return "";
    }
    
    public String getType(){
       return this.health;
    }
    
    public Integer getHealth(){
       return this.health;
    }
    
    public Integer getAttackValue(){
       Sytem.out.println("The zombie rushes out and bites you!");
       return this.attackValue;   
    }
    
}
