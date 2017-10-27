/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stupidshoppinglist;

import java.util.ArrayList;

/**
 *
 * @author ncc
 */
public class ShoppingList {
    private String name;
    private ArrayList<ShoppingItem> items;
    
    public ShoppingList(){
        items = new ArrayList();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Double calculateTotal(){
        Double sum = 0.0;
        for(ShoppingItem i: items){
            sum += i.calculateTotal();
        }
        return sum;
    }
    
    public void addItem(ShoppingItem item){
        items.add(item);
    }
    
    public void removeItem(ShoppingItem item){
        items.remove(item);
    }
    
    public ArrayList<ShoppingItem> getItems(){
        return items;
    }
    
    @Override
    public String toString(){
        String returnString = "List Name: " + this.name;
        returnString += "\titems: \n";
        for(ShoppingItem item: this.items){
            returnString += "\t" + item.toString();
            returnString += "\n";
        }
        return returnString;
    }
}   
