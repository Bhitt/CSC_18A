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
    
    @Override
    public String printYoSelf(){
        return "";
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
        System.out.println("The Skeleslime swings a green gelatanous arm at you!");
        return this.getAttack();
    }
}
