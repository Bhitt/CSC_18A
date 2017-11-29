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
        // Prints/returns ascii art of a Skeleslime
        return "";
    }
    
    public String getType(){
        return this.health;
    }
    
    public Integer getHealth(){
        return this.health;
    }
    
    public Integer getAttack(){
        System.out.println("The Skeleslime swings a green gelatanous arm at you!");
        return this.attack;   
    }
}
