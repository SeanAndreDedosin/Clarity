/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clarityapp;

import javax.swing.JOptionPane;

/*Andre Github*/
/*Andre Author*/

public class HealthFormApp {
    public static void main(String args[]){
        //declare data members
        int mark;
        int count;
        String grade;

        //declare objects
        HealthForm myHealthForm = new HealthForm();

            //input
            mark = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a mark (Mark from 1 to 24)"));
            myHealthForm.setMark(mark);

            //process
            myHealthForm.compute();

            //output
            grade = myHealthForm.getGrade();
            if(grade.equalsIgnoreCase("Error")){
                JOptionPane.showMessageDialog(null,"Sorry, you entered an invalid grade.");
        }
            else{
                JOptionPane.showMessageDialog(null,"Thank you for completing the Form. "+grade);
            }
    }
}
