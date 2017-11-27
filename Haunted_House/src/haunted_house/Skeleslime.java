/* Skeleslime class that - derives from the Enemy class
 *                       - has unique stats
 *                       - displays an ascii picture of itself
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class Skeleslime extends Enemy{
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
    
    public Integer skeleslimeAttacks()
    {
        //IDK if this should be kept or something but for now, this will be here.
        System.out.println("The Skeleslime swings a green gelatanous arm at you!");
        return this.getAttack();
    }
}
