/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stupidshoppinglist;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class StupidShoppingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a shopping list name (q to quit):");
        String name = input.nextLine();
        if(name.equalsIgnoreCase("q")){
            return;
        }
        ShoppingList list = new ShoppingList();
        list.setName(name);
        Boolean done = false;
        while(!done){
            System.out.println("Press 1 to create a new item, or 0 to quit:");
            int menu = input.nextInt();
            if(menu == 0){
                done =true;
            } else {
                ShoppingItem item = new ShoppingItem();
                System.out.println("Enter a name for your item:");
                item.setTitle(input.nextLine());
                System.out.println("Enter a description for your item:");
                item.setDescription(input.nextLine());
                System.out.println("Enter a price for your item:");
                item.setUnitPrice(input.nextDouble());
                System.out.println("Enter a quantity of items:");
                item.setQuantity(input.nextDouble());
                list.addItem(item);
                System.out.println(list);
            }
        }
        System.out.println(list);
    }
}
