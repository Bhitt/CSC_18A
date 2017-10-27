/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Boolean done = false;
        ArrayList<Integer> studentAges = new ArrayList();
        while (!done){
            System.out.print("\nPlease enter a student age (-1 to quit)");
            Integer age = input.nextInt();
            if(age == -1) done=true;
            else studentAges.add(age);
        }
        
        Double avg = 0.0;
        int sum = 0;
        for(Integer i:studentAges){
            sum+=i;
        }
        System.out.println("Average student age is " + sum /studentAges.size());
    }
    
}
