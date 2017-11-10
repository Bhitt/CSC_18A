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
public class CruiseShip extends Ship {
    private int maxPass;
    
    
    public CruiseShip(String n, String y, int max){
        super(n,y);
        this.maxPass = max;
    }

    public int getMaxPass() {
        return maxPass;
    }


    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }
    
    @Override
    public String toString(){
        StringBuilder reString = new StringBuilder();
        reString.append(this.getName() + ", Max Passengers: " + this.maxPass + "\n");
        return reString.toString();
    }
}
