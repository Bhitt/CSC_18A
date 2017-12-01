/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indiegame;

/**
 *
 * @author ncc
 */
public class IndieGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Story s = new Story();
        s.addChapter(new HiClass());
        Menu startMenu = new Menu(s);
        while(true) {
            startMenu.printMenu();
            Integer selection = startMenu.getInput();
            startMenu.performAction(selection);
        }
        
    }
    
}
