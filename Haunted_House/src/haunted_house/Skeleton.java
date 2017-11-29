/* Skeleton class that - derives from the Enemy class
 *                     - has unique stats
 *                     - displays an ascii picture of itself
 * 
 */

package haunted_house;

/**
 *
 * 
 */
public class Skeleton extends Enemy {
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
        System.out.println("The skeleton swings his old, rusty sword at you!");
        return this.attack;   
    }

}
