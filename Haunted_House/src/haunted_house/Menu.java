/* Menu class that  - runs an input loop until an action is executed
                    - displays a list of menu items and validates the choice
 *                  - runs the action of the menu item chosen:
 *                       o starts a new game
 *                       o loads a previous game
 *                       o load and display a file of high scores
 *                       o exits the program
 */

package haunted_house;

//includes for ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public final class Menu {
    //Menu Properties
    private final ArrayList<MenuItem> menuItems;
    private boolean exitMenuStatus;
    
    //**********************************************************
    //                Default Constructor 
    //**********************************************************
    public Menu(){
        //initiate exitMenuStatus to false
        exitMenuStatus = false;
        //create an ArrayList to hold all the menu items
        this.menuItems = new ArrayList();
        //add the menu items
        this.menuItems.add(new StartGameMenuItem());         //start a new game
        this.menuItems.add(new LoadGameMenuItem());          //load a game
        this.menuItems.add(new DisplayHighscoresMenuItem()); //display high scores
        this.menuItems.add(new QuitGameMenuItem());          //quit the application
        //begin menu loop
        menuLoop();
    }
    
    //**********************************************************
    //                 Menu Loop 
    //**********************************************************
    public void menuLoop(){
        //run menu loop
        do{
            //Player.getInstance().promptName();
            //print the menu
            this.printMenu();
            //choose menu option
            Integer selection = this.getMenuItem();
            System.out.println("*******************************\n");
            //System.out.println();
            //validate the choice
            if(this.validateMenuOption(selection)){
                //execute menu option
                exitMenuStatus = this.performAction(selection);
            } else {
                //respond to invalid choice
                System.out.println("Invalid selection. Please choose a valid one");
            }
        }while(!exitMenuStatus);
    }
    
    //**********************************************************
    //                 Print the menu to the user 
    //**********************************************************
    private void printMenu(){
        //build a string of the menu to print
        StringBuilder menuString = new StringBuilder();
        menuString.append("*******************************\n")
                  .append("Welcome to the Haunted House. Please choose from the following:\n");
        //loop through and add menu item choices to the string
        for(int i=0;i<menuItems.size();i++){
            menuString.append((i+1)).append(":").append(menuItems.get(i).printYoSelf()).append("\n");
        }
        //add the final prompt
        menuString.append("Enter your option:");
        //output the whole string
        System.out.println(menuString);
    }
    
    //**********************************************************
    //          Grab input from the user for menu choice
    //**********************************************************
    private Integer getMenuItem(){
        //create scanner
        Scanner input = new Scanner(System.in);
        //return next Integer
        return  input.nextInt();
    }
    
    //**********************************************************
    //          Validate menu option chosen by the user 
    //**********************************************************
    private boolean validateMenuOption(Integer selection){
        //return true or false depending on if the choice exists
        return (selection > 0 && selection <= menuItems.size());
    }
    
    //**********************************************************
    //                 Perform Action of menu choice
    //**********************************************************
    private boolean performAction(Integer selection){
        //the choice (subtract one) should match the index of items in the array
        return menuItems.get(selection - 1).doThing();
    }
    
    
}
