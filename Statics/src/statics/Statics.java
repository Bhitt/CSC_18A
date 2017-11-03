/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statics;

/**
 *
 * @author ncc
 */
public class Statics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog[] dogs = {
            new Dog(),
            new Dog(),
            new Dog(),
            new Dog(),
            new Dog()
        };
        System.out.println("Large Dog = " + Dog.LARGE); //large is static so its found in the class not the objects
    }
    
}
