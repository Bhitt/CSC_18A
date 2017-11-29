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
    String type;
    Integer health;
    Integer attackValue;

    public abstract String getType();
    
    public abstract Integer getHealth();
    
    public abstract Integer getAttackValue();

    //**********************************************************
    //      Required method -  displays picture of enemy 
    //**********************************************************
    public abstract void printYoSelf();

}
