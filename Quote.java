/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quoteapp;

/**
 *
 * @author marym
 */
public class Quote {
    protected String day;
    protected String type;

    public Quote(String daily, String type) {
        this.day = day;
        this.type = type;
    }
    
    
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getInfo(){
        return "Day :"+day+"\nType :"+type;
    }
}
