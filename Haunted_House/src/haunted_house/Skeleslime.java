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
    //String type;
    //Integer health;
    //Integer attackValue;
    
    @Override
    public void printYoSelf(){
        
    }
    
    @Override
    public String getType(){
        return this.type;
    }
    
    @Override
    public Integer getHealth(){
        return this.health;
    }
    
    @Override
    public Integer getAttackValue(){
        System.out.println("The Skeleslime swings a green gelatanous arm at you!");
        return this.attackValue;   
    }
}
