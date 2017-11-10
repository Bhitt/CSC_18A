/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7_class_example;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class EnterGradeMenuItem extends MenuItem{

    @Override
    public void doSomething() {
        //Create the entry for a grade
        Entry grade = new Entry();
        //Ask the user for input
        System.out.print("Enter the first name, last name, and grade:");
        Scanner input = new Scanner(System.in);
        grade.setFirstName(input.nextLine());
        grade.setLastName(input.nextLine());
        grade.setGrade(input.nextDouble());
        //Add that entry to the gradebook
        Gradebook.getInstance().addGrade(grade);
    }

    @Override
    public String printYoSelf() {
        return "Enter a grade";
    }
    
}
