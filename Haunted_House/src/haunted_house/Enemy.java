/*  Enemy abstract class for specific enemies to derive from
 *                          - requires type
 *                          - requires health
 *                          - requires attack value
 *                          - requires setters/getters for the above
 *                          - requires a display method from derived classes
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public abstract class Enemy {
    //Enemy properties
    private String type;
    private Integer health;
    private Integer attackValue;

    
    Enemy(String t, Integer h, Integer a){
        this.type = t;
        this.health = h;
        this.attackValue = a;
    }
    //**********************************************************
    //      Method -  get/set enemy type
    //**********************************************************
    public String getType(){
        return this.type;
    };
    public  void setType(String t){
        this.type = t;
    };
    
    //**********************************************************
    //      Required method -  get/set enemy health  
    //**********************************************************
    public Integer getHealth(){
        return this.health;
    }
    public  void setHealth(Integer h){
        this.health = h;
    }
    
    //**********************************************************
    //      Required method -  gets/set attack value
    //**********************************************************
    public  Integer getAttackValue(){
        return this.attackValue;
    }
    public  void setAttackValue(Integer a){
        this.attackValue = a;
    }
    
    
    //**********************************************************
    //      Required method -  displays picture of enemy 
    //**********************************************************
    public abstract void printYoSelf();
    
    //**********************************************************
    //      Required method -  displays picture of enemy 
    //**********************************************************
    public abstract void printYoAttack();
    
    //**********************************************************
    //      Required method -  enemy takes damage
    //**********************************************************
    public void takeDamage(int d){
        this.health -= d;
    }
}
