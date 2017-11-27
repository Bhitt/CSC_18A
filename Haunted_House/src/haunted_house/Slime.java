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
    Integer attack;
    
    @Override
    public String printYoSelf(){
        return "";
    }
    
    public String getType()
    {
        return this.health;
    }
    
    public Integer getHealth()
    {
        return this.health;
    }
    
    public Integer getAttack()
    {
        return this.attack;   
    }
    
}
