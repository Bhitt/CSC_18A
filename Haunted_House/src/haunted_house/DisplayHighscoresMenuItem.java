/* DisplayHighscoresMenuItem class that - derives from menu item
 *                                      - loads in a CSV file
 *                                      - ouputs the CVS file contents to the user
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class DisplayHighscoresMenuItem extends MenuItem {
    
    
    
    @Override
    public boolean doThing(){
         //Test string
        System.out.println("You displayed high scores");
        return false;
    }
    
    @Override
    public String printYoSelf(){
        return "View High Scores";
    }
}
