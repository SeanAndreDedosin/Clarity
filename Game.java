/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 *
 * @author marym
 */
public class Game {
    private String question;
    private String answer;

    public Game(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Game(){
        question = " ";
        answer = " ";
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    
}
