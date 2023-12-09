/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentalapp;

import javax.swing.JOptionPane;

/**
 *
 * @author marym
 */

    public class Quiz {
    //counts for severity levels and response and question
    private int notPresentCount, mildCount, moderateCount, severeCount, verySevereCount;
    private int ans; 
    private String question;
    //private int counter;

    public Quiz(int notPresentCount, int mildCount, int moderateCount, int severeCount, int verySevereCount, int ans, String question) {
        this.notPresentCount = notPresentCount;
        this.mildCount = mildCount;
        this.moderateCount = moderateCount;
        this.severeCount = severeCount;
        this.verySevereCount = verySevereCount;
        this.ans = ans;
        this.question = question;
    }
    
    public Quiz(){
        notPresentCount = 0;
        mildCount = 0;
        moderateCount = 0;
        severeCount = 0;
        verySevereCount = 0;
        ans = 0;
    }

    public int getNotPresentCount() {
        return notPresentCount;
    }

    public void setNotPresentCount(int notPresentCount) {
        this.notPresentCount = notPresentCount;
    }

    public int getMildCount() {
        return mildCount;
    }

    public void setMildCount(int mildCount) {
        this.mildCount = mildCount;
    }

    public int getModerateCount() {
        return moderateCount;
    }

    public void setModerateCount(int moderateCount) {
        this.moderateCount = moderateCount;
    }

    public int getSevereCount() {
        return severeCount;
    }

    public void setSevereCount(int severeCount) {
        this.severeCount = severeCount;
    }

    public int getVerySevereCount() {
        return verySevereCount;
    }

    public void setVerySevereCount(int verySevereCount) {
        this.verySevereCount = verySevereCount;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    
    public void compute(){
        switch (ans) {
                case 1:
                    notPresentCount++;
                    break;
                case 2:
                    mildCount++;
                    break;
                case 3:
                    moderateCount++;
                    break;
                case 4:
                    severeCount++;
                    break;
                case 5:
                    verySevereCount++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid response.");
                    return;
    }

    int maxCount = Math.max(notPresentCount, Math.max(mildCount, Math.max(moderateCount, Math.max(severeCount, verySevereCount))));

        if (maxCount == notPresentCount) {
            JOptionPane.showMessageDialog(null, "Not Present");
        } else if (maxCount == mildCount) {
            JOptionPane.showMessageDialog(null, "Mild");
        } else if (maxCount == moderateCount) {
            JOptionPane.showMessageDialog(null, "Moderate");
        } else if (maxCount == severeCount) {
            JOptionPane.showMessageDialog(null, "Severe");
        } else if (maxCount == verySevereCount) {
            JOptionPane.showMessageDialog(null, "Very Severe");
        }}
}


