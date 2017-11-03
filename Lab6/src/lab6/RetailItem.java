/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

/**
 *
 * @author ncc
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(String d, int u, double p){
        this.description =d;
        this.unitsOnHand=u;
        this.price=p;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getUnitsOnHand() {
        return unitsOnHand;
    }


    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
