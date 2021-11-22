package com.company;
import java.lang.*;
public class Book {
    private int pages;
    private double pricepage;
    public Book(int p, double pp){
        pages = p;
        pricepage = pp;
    }
    public Book(int p){
        pages = p;
        pricepage = 0;
    }
    public Book(){
        pages = 0;
        pricepage = 0;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public void setPricepage(double pricepage){
        this.pages=pages;
    }
    public double getProfit(){
        double profit;
        profit = pages * pricepage * 1.5 - pages * pricepage;
        return profit;
    }
}
