/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        CashRegister register = new CashRegister();
        Boolean done = false;
        int count=0;
        while(!done){
            System.out.println("Press 1 to create a new item, or 0 to quit");
            int menu = input.nextInt();
            if(menu == 0) done =true;
            else {
                String s;
                int i;
                double d;
                System.out.println("Enter a description for your item:");
                s = stringInput.nextLine();
                System.out.println("Enter a quantity for your item:");
                i = input.nextInt();
                System.out.println("Enter a price for your item:");
                d = input.nextDouble();
                RetailItem item = new RetailItem(s,i,d);
                register.addItem(item);
                count++;
            }
        }
        for(RetailItem item: register.items){
            System.out.println("Description: " + item.getDescription());
            System.out.println("Quantity: " + item.getUnitsOnHand());
            System.out.println("Unit Price: " + item.getPrice()+ "\n");
        }
        
        System.out.println("Sales Receipt:");
        System.out.println("Items: " + count);
        System.out.println("Subtotal : $" + register.getSubtotal());
        System.out.println("Sales Tax: $" + register.getTax());
        System.out.println("Total    : $" + register.getTotal());
    }
    
}
