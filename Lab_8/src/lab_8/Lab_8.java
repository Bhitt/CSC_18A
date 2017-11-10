/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ncc
 */
public class Lab_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Ship> ships = new ArrayList();
        Random rand = new Random();
        int randomNum;
        for(int i=0; i<8; i++){
            randomNum = rand.nextInt(3)+1;
            if(randomNum == 1){
                ships.add(new Ship("Jenny","1994"));
            } else if(randomNum == 2){
                ships.add(new CruiseShip("Abigail", "1902", 5));
            } else{
                ships.add(new CargoShip("Jeff","1602 B.C.", 500000));
            }
        }
        //
        ships.add(new Ship("Jenny", "1994"));
        ships.add(new CruiseShip("Abigail", "1902", 5));
        ships.add(new CargoShip("Jeff","1602 B.C.", 500000));
        
        for(Ship s: ships){
            System.out.println(s.toString());
        }
    }
    
}
