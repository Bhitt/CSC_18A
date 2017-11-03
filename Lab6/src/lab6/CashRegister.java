/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.ArrayList;

/**
 *
 * @author ncc
 */
public class CashRegister {
    public ArrayList<RetailItem> items;

    public CashRegister(){
        items = new ArrayList();
    }
    
    public void addItem(RetailItem item){
        items.add(item);
    }
    
    public double getSubtotal(){
        double sub=0.0;
        for(RetailItem item: this.items){
            sub+= (item.getPrice()*item.getUnitsOnHand());
        }
        return sub;
    }
    
    public double getTax(){
        return this.getSubtotal()*0.06;
    }
    
    public double getTotal(){
        return this.getSubtotal() + this.getTax();
    }
}
