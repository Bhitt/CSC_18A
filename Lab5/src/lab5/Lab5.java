/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

/**
 *
 * @author ncc
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rainfall r = new Rainfall();
        Double a = r.calculateTotalAnnualRainfall();
        Double b = r.calculateAverageMonthlyRainfal();
        int c = r.calculateMonthWithMostRain();
        int d = r.calculateMonthWithLeastRain();
        
        System.out.println("Total: " + a + ", average: " + b);
        System.out.println("Most: " + c + ", least: " + d);
    }
    
}
