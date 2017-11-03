/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_version_lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhitt
 */
public class RetailItem {
    private String description;
    private double unitsOnHand;
    private double price;
    
    public RetailItem(String description, double unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public double getUnitsOnHand() throws NotEnoughUnitsException {
        if (unitsOnHand < 0) {
            throw new NotEnoughUnitsException();
        }
        return unitsOnHand;
    }

    public void setUnitsOnHand(double unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        String returnString = "Description: " + this.getDescription() + "\n";
        returnString += "Price: " + this.getPrice() + "\n";
        try {
            returnString += "Quantity On Hand: " + this.getUnitsOnHand() + "\n";
        } catch (NotEnoughUnitsException ex) {
            Logger.getLogger(RetailItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returnString;
    }
    
    public String toCSV() {
        return this.description + "," + this.price + "," + this.unitsOnHand + "\n";
    } 
}
