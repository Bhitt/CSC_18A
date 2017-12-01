/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indiegame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Menu {
    private ArrayList<IMenuItem> menuItems;
    
    public Menu(Story s) {
        this.menuItems = new ArrayList();
        for (int i =0; i < s.getChapters().size(); i++) {
            menuItems.add(s.getChapters().get(i).getMenuItem());
        }
        menuItems.add(new QuitMenuItem());
    }
    
    public void printMenu() {
        StringBuilder menu = new StringBuilder();
        
        menu.append("Welcome to \"You're a hairy wizard, Larry\"\n");
        Integer itemCount = 1;
        for (int i = 0; i < menuItems.size(); i++) {
            menu.append(i + 1 + ":" + menuItems.get(i).getText() + "\n");
        }
        // Our menu options go in here somewhere.
        
        System.out.println(menu.toString());
    }
    
    public Integer getInput() {
        System.out.println("Please enter your selection: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    public void performAction(Integer selection) {
        menuItems.get(selection - 1).execute();
    }
}
