/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7_class_example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Menu {
    private ArrayList<MenuItem> menuItems;
    
    public Menu(){
        this.menuItems = new ArrayList();
        this.menuItems.add(new EnterGradeMenuItem());
        this.menuItems.add(new ImportCSVMenuItem());
        this.menuItems.add(new ExportCSVMenuItem());
        this.menuItems.add(new ShowGradebookMenuItem());
        this.menuItems.add(new QuitMenuItem());
    }
    
    public void printMenu(){
        StringBuilder menu = new StringBuilder();
        menu.append("Welcome to the GradeBook. Please choose from the following options:\n");
        for(int i=0;i<menuItems.size();i++){
            menu.append((i+1) + ":" + menuItems.get(i).printYoSelf() + "\n");
        }
        menu.append("Enter your option:");
        System.out.println(menu);
    }

    public Integer getMenuItem() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public boolean validateMenuOption(Integer selection){
        return (selection > 0 && selection <= menuItems.size());
    }
    
    public void performAction(Integer selection) {
        menuItems.get(selection - 1).doSomething();
    }

}
