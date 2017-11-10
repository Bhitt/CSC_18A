/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_8;

/**
 *
 * @author ncc
 */
public class Ship {
    private String name;
    private String year;
    
    public Ship(String n, String y){
        this.name = n;
        this.year = y;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }
    
    @Override
    public String toString(){
            StringBuilder reString = new StringBuilder();
            reString.append(this.name + ", " + this.year + "\n");
            return reString.toString();
    }
}
