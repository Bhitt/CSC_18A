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
class Rainfall {
    Double[] rainfall = {10.0, 12.0, 14.0, 11.0, 9.0, 6.0, 5.0, 7.0, 9.0, 7.0, 11.0, 12.0};
    public Double calculateTotalAnnualRainfall() {
        Double sum = 0.0;
        for(Double d: rainfall){
            sum+=d;
        }
        return sum;
    }

    public Double calculateAverageMonthlyRainfal() {
        Double total = calculateTotalAnnualRainfall();
        Double avg = total / rainfall.length;
        return avg;
    }

    public int calculateMonthWithMostRain() {
        Double max = rainfall[0];
        int index = 0;
        for(int i=1; i< rainfall.length;i++){
            if(rainfall[i] > max){
                max = rainfall[i];
                index = i;
            }
        }
        return index;
    }

    public int calculateMonthWithLeastRain() {
        Double min = rainfall[0];
        int index = 0;
        for(int i=1; i< rainfall.length;i++){
            if(rainfall[i] < min){
                min = rainfall[i];
                index = i;
            }
        }
        return index;
    }
    
}
