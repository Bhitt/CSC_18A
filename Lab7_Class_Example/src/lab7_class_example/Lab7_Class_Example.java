/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7_class_example;

/**
 *
 * @author ncc
 */
public class Lab7_Class_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m = new Menu();
        
        //unfinished but object-based menu mostly set up
        
        m.printMenu();
        Integer selection = m.getMenuItem();
        if(m.validateMenuOption(selection)){
//            System.out.println("Would have selected menu item " + selection);
            m.performAction(selection);
        }else{
            System.out.println("Invalid selection. Choose a valid one");
        }
    }
    
}
