/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chap7_pc11;

/**
 *
 * @author bhitt
 */
public class Java_Chap7_PC11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {
            5,6,8,9,10,23,4,6,7,8
        };
        System.out.println("This is the total: " + getTotal(array));
        System.out.println("This is the average: " + getAvg(array));
        System.out.println("This is the highest: " + getHigh(array));
        System.out.println("This is the lowest: " + getLow(array));
        
    }
    public static int getTotal(int[] array){
        int temp=0;
        for(int i=0;i<array.length;i++){
            temp+=array[i];
        }
        return temp;
    }
    public static double getAvg(int[] array){
        double temp=0.0;
        for(int number:array){
            temp+=number;
        }
        temp/=array.length;
        return temp;
    }
    public static int getHigh(int[] array){
        int temp=array[0];
        for(int number:array){
            if(number>temp) temp=number;
        }
        return temp;
    }
    public static int getLow(int[] array){
        int temp=array[0];
        for(int number:array){
            if(number<temp) temp=number;
        }
        return temp;   
    }
}
