/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quoteapp;

/**
 *
 * @author marym
 */
public class Diary extends Quote{
    private String mood; 
    private String feelings;

    public Diary(String mood, String feelings, String day, String type) {
        super(day, type);
        this.mood = mood;
        this.feelings = feelings;
    }
    
    public Diary(){
        super("","");
        mood = " ";
        feelings = " ";
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getFeelings() {
        return feelings;
    }

    public void setFeelings(String feelings) {
        this.feelings = feelings;
    }

    @Override
    public String getDay() {
        return day;
    }

    @Override
    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo()+"\nMood :"+mood+"\nFeelings : "+feelings;
    }
    
    
}
