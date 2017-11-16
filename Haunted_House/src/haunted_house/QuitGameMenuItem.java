/* QuitGameMenuItem class that - allows the player to exit the program from the Menu
 * 
 * 
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class QuitGameMenuItem extends MenuItem{
    
    
    
    @Override
    public boolean doThing(){
         //Test string
        System.out.println("Goodbye");
        return true;
    }
    
    @Override
    public String printYoSelf(){
        return "Quit the Application";
    }
}
