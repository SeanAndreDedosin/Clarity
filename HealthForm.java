/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clarityapp;

/*Andre Github*/
/*Andre Author*/

public abstract class HealthForm {
    //declare data members
    private int mark;
    private String grade;
    private String fQuestions[];

    //constructor
    public HealthForm(int question, String grade) {
        mark = 0;
        grade = " ";
    }
    
    //compute
    public void compute(){
        if(mark<=0 && mark<=8){
            grade = "You are all Good!";
        }
        else if(mark<=9 && mark<=18){
            grade = "You have a few underlying issues that need some improvement";
        }
        else if(mark<=19 && mark<=24){
            grade = "It is best to seek Professional Help. Do not be afraid to ask, we are there for you";
        }
        else{
            grade = "Please input Something";
        }
    }
    
    //getters
    public String getGrade() {
        return grade;
    }
    
}
