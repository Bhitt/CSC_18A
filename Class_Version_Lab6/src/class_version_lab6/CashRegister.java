/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_version_lab6;

import java.util.ArrayList;

/**
 *
 * @author bhitt
 */
class CashRegister {
    private ArrayList<RetailItem> sale;
    
    public CashRegister(){
        sale = new ArrayList();
    }
    
    public void addItem(RetailItem item){
        sale.add(item);
    }
    
    public double getSubtotal(){
        double subtotal = 0.0;
        for(RetailItem item:sale){
            subtotal += item.getPrice();
        }
        return subtotal;
    }
    
    public double getSalesTax(){
        return this.getSubtotal() *0.06;
    }
    
    public double getTotal(){
        return this.getSubtotal() + this.getSalesTax();
    }

/* Sales Receipt
Output a sales receipt showing the output of all of the items entered into the cash register.
Sales Receipt:
Items: 3
Subtotal: $15.00
Sales-Tax: $5.00
Total: $20.00
*/
    @Override
    public String toString(){
        StringBuilder returnSB = new StringBuilder();
        returnSB
                .append("Sales Receipt:\n")
                .append("Items: ")
                .append(this.sale.size())
                .append("\n");
        for (RetailItem item:sale){
            returnSB.append(item.toString()).append("\n");
        }
        returnSB.append("Subtotal: ")
                .append(this.getSubtotal())
                .append("\n")
                .append("Sales-Tax: ")
                .append(this.getSalesTax())
                .append("\n")
                .append("Total: ")
                .append(this.getTotal())
                .append("\n");
        return returnSB.toString();           
    }
    
    public String toCSV(){
        StringBuilder sb =new StringBuilder();
        sb.append("description,price,units on hand\n");
        for(RetailItem item:sale){
            sb.append(item.toCSV());
        }
        return sb.toString();
    }
}
