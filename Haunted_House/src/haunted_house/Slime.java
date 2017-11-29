/* Slime class that - derives from the Enemy class
 *                  - has unique stats
 *                  - displays an ascii picture of itself
 * 
 */

package haunted_house;

/**
 *
 * 
 */
public class Slime extends Enemy{
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
       System.out.println("The slime tries to swallow you whole!");
        return this.attack;   
    }
    
}
