/* Fall 2017 CIS18A Java Final Project
 * Project Members: Branden Hitt, Graeme Gonzales, Miles, Ricardo Santiago, and Ulises Rojas
 * Main program execution starts here
 * Purpose: Gothic themed, roque-like dungeon crawler video game 
 *          which utilizes concepts learned in class.
 * 
 */

package haunted_house;

/**
 *
 * 
 */
public class Haunted_House {

    /**
     * main application starts here
     * @param args
     */
    public static void main(String[] args) {
        //Add title screen
        TitleScreen title = new TitleScreen();
        title.printTitleScreen();
        //Create a menu and run application content
        Menu m = new Menu();
        //exit stage right  
    }
    
}
