/* MenuItem abstract class that - other MenuItem classes can derive from
 *                              - specifies what all MenuItem class need
 * 
 * 
 */

package haunted_house;

/**
 *
 * 
 */
public abstract class MenuItem {
    //Every menu item needs an action
    public abstract boolean doThing();
    //Descriptive string for menu display
    public abstract String printYoSelf();
}
