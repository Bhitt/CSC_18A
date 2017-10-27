/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stupidshoppinglist;

/**
 *
 * @author ncc
 */
public class ShoppingItem {
    private double quantity;
    private String title;
    private String description;
    private double unitPrice;
    
    public double calculateTotal(){
        return quantity * unitPrice;
    }
    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    @Override
    public String toString(){
        return this.title + "\n\t\tdescription:" + this.description + "\n\t\tprice:" + this.unitPrice + "\n\t\tquantity:" + this.quantity + "\n";
    }
    
    public boolean equals(ShoppingItem itemToCompare){
        if(this.description.equals(itemToCompare.description)) return true;
        return false;
    }
}
