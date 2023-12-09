/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quoteapp;

/**
 *
 * @author marym
 */
public class Quote1 extends Quote{
    private String quote1; 
    private String author;

    public Quote1(String quote1, String author, String day, String type) {
        super(day, type);
        this.quote1 = quote1;
        this.author = author;
    }

    public Quote1(){
        super("","");
        this.quote1 = " ";
        this.author = " ";
    }
    
    public String getQuote1() {
        return quote1;
    }

    public void setQuote1(String quote1) {
        this.quote1 = quote1;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        return super.getInfo()+"\nAuthor :"+author+"\nQuote 1: "+quote1;
    }
    

}
