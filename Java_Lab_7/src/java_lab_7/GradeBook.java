/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

import java.util.ArrayList;

/**
 *
 * @author bhitt
 */
class GradeBook {
    private ArrayList<GradeBookEntry> collection;
    
    public GradeBook(){
        collection = new ArrayList();
    }
    
    public void addEntry(GradeBookEntry entry){
        collection.add(entry);
    }
    public double getClassAvg(){
        double avg = 0.0;
        for(GradeBookEntry entry:collection){
            avg+=entry.getGradePercent();
        }
        avg/=collection.size();
        return avg;
    }
    
 /* GradeBook Output
Output a gradebook showing all the grades entered
GradeBook:
Students: 1

Student Name: Branden Hitt
Letter Grade: A
Test Percent: 95.26    
    
Class Average: %95.26
*/
    @Override
    public String toString(){
        StringBuilder wordSmith = new StringBuilder();
        wordSmith.append("****************************\n")
                .append("GradeBook:\n")
                .append("Students: ")
                .append(this.collection.size())
                .append("\n");
        for(GradeBookEntry entry:collection){
            wordSmith.append(entry.toString()).append("\n");
        }
        wordSmith.append("Class Average: ")
                .append(this.getClassAvg())
                .append("\n");
        return wordSmith.toString();
    }
    
    public String toCSV(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name,Letter Grade,Test Percent\n");
        for(GradeBookEntry entry:collection){
            sb.append(entry.toCSV());
        }
        return sb.toString();
    }
    
}
