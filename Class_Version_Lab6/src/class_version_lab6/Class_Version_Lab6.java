/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_version_lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bhitt
 */
public class Class_Version_Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        RetailItem shoes = new RetailItem("Converse Sneakers", 12.0, 20.00);
        System.out.println(shoes);
        CashRegister register = new CashRegister();
//        //Uncomment this for CSV Reading
//        File importRegister = new File("receipt.csv");
//        Scanner fileIn = new Scanner(importRegister);
//        while(fileIn.hasNextLine()){
//            String line = fileIn.nextLine();
//            String[] data = line.split(",");
//            for(String s: data){
//                System.out.println(s);
//            }
//            RetailItem item = new RetailItem(data[0], Double.parseDouble(data[2]), Double.parseDouble(data[1]));
//            register.addItem(item);
//        }
//        
//        System.out.println(register);
    
        register.addItem(shoes);
        register.addItem(shoes);
        System.out.println(register.toCSV());
        try{
            PrintWriter csvWriter = new PrintWriter("salesReceipt.csv");
            csvWriter.println(register.toCSV());
            csvWriter.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
