/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bhitt
 */
public class Java_Lab_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GradeBook currentGB = new GradeBook();
        String choice="";
        String input="";
        String name="";
        String skip="";
        double gp=0.0;
        do{
            choice = JOptionPane.showInputDialog("Welcome to the GradeBook. Please " +
                                               "choose from the following options:\n" +
                                               "1. Enter a test grade\n" +
                                               "2. Import gradebook from CSV file\n" +
                                               "3. Export gradebook to CSV file\n" +
                                               "4. Show gradebook to screen\n" +
                                               "5. Exit\n" +
                                               "Enter your option:");
            if(choice.equals("1")){
                //Enter a test grade
                input = JOptionPane.showInputDialog("What is the student's name:");
                name = input;
                input = JOptionPane.showInputDialog("What is the student's test percentage:");
                gp = Double.parseDouble(input);
                GradeBookEntry entry = new GradeBookEntry(name,gp);
                currentGB.addEntry(entry);
                //print current gradebook
                System.out.println(currentGB.toString());
            }else if(choice.equals("2")){
                //Import gradebook
                input = JOptionPane.showInputDialog("What is the name of the file you wish to import: (ex: GradeBook1.csv)");
                try{
                    File importGB = new File(input);
                    Scanner fileIn = new Scanner(importGB);
                    skip = fileIn.nextLine();
                    //System.out.println(skip);
                    while(fileIn.hasNextLine()){
                        String line = fileIn.nextLine();
                        String[] data = line.split(",");
                        for(String s: data){
                            System.out.println(s);
                        }
                        //System.out.println("Right before parse!");
                        if(fileIn.hasNextLine()){
                            GradeBookEntry entry = new GradeBookEntry(data[0], Double.parseDouble(data[2]));
                            currentGB.addEntry(entry);
                        }
                    }
                }catch(FileNotFoundException e){
                    JOptionPane.showMessageDialog(null, "File not found.");
                }
            
            }else if(choice.equals("3")){
                //Export gradebook
                input = JOptionPane.showInputDialog("What would you like to name this file: (ex: GradeBook1.csv)");
                try{
                    PrintWriter csvWriter = new PrintWriter(input);
                    csvWriter.println(currentGB.toCSV());
                    csvWriter.close();
                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }else if(choice.equals("4")){
                //Exit
                JOptionPane.showMessageDialog(null, currentGB.toString());
            }else if(choice.equals("5")){
                //Exit
                JOptionPane.showMessageDialog(null, "Goodbye");
            }else{
                //Default case
                JOptionPane.showMessageDialog(null, "Invalid Entry");
            }
        }while(!choice.equals("5"));
        //exit stage right
    } 
}
