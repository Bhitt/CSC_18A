/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7_class_example;

/**
 *
 * @author ncc
 */
public class ShowGradebookMenuItem extends MenuItem {

    @Override
    public void doSomething() {
        Gradebook.getInstance().printGrades();
    }

    @Override
    public String printYoSelf() {
        return "Show gradebook grades";
    }
    
}
