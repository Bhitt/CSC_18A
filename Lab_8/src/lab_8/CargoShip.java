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
public class CargoShip extends Ship {
    private int cargoCapicityTonnage;
    
    public CargoShip(String n, String y,int cargo){
        super(n,y);
        this.cargoCapicityTonnage = cargo;
    }

    public int getCargoCapicityTonnage() {
        return cargoCapicityTonnage;
    }

    public void setCargoCapicityTonnage(int cargoCapicityTonnage) {
        this.cargoCapicityTonnage = cargoCapicityTonnage;
    }
    
    @Override
    public String toString(){
        StringBuilder reString = new StringBuilder();
        reString.append(this.getName() + ", Cargo Capacity (tonnage): " + this.cargoCapicityTonnage + "\n");
        return reString.toString();
    }
}
