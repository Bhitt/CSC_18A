/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

/**
 *
 * @author bhitt
 */
class GradeBookEntry {
    private String StudentName;
    private String LetterGrade;
    private double GradePercent;

    public GradeBookEntry(String name, double percent){
        this.StudentName = name;
        this.GradePercent = percent;
        if(percent >= 90){
            this.LetterGrade = "A";
        }else if(percent < 90 && percent >= 80){
            this.LetterGrade = "B";
        }else if(percent < 80 && percent >= 70){
            this.LetterGrade = "C";
        }else if(percent < 70 && percent >= 60){
            this.LetterGrade = "D";
        }else{
            this.LetterGrade = "F";
        }
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getLetterGrade() {
        return LetterGrade;
    }

    public void setLetterGrade(String LetterGrade) {
        this.LetterGrade = LetterGrade;
    }

     public double getGradePercent() {
        return GradePercent;
    }

    public void setGradePercent(double GradePercent) {
        this.GradePercent = GradePercent;
    }
    
    @Override
    public String toString(){
        String returnString = "Student Name : " + this.getStudentName() + "\n" +
                              "Letter Grade : " + this.getLetterGrade() + "\n" +
                              "Test Percent: " + this.getGradePercent() + "\n";
        return returnString;
    }
    
    public String toCSV(){
        return this.StudentName + "," + this.LetterGrade + "," + this.GradePercent + "\n";
    }
    
}
