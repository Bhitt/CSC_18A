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
    String type;
    Integer health;
    Integer attackValue;
    
    public abstract String printYoSelf();
}
