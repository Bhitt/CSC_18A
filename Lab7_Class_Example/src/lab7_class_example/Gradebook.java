/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7_class_example;

import java.util.ArrayList;

/**
 *
 * @author ncc
 */
public class Gradebook {
    ArrayList<Entry> entries;
    public static Gradebook _instance;
    
    private Gradebook(){
        this.entries = new ArrayList();
    }
    
    public static Gradebook getInstance(){
        if(_instance != null){
            return _instance;
        }else{
            _instance = new Gradebook();
            return _instance;
        }
    }
    
    public void addGrade(Entry e){
        entries.add(e);
    }
    
    public void printGrades(){
        for(Entry e: entries){
            System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getGrade());
        }
        
    }
}
