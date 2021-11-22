package com.company;
import java.lang.*;
public class Main {
    public static void main(String[] args){
        Ball n1 = new Ball(6000,5);
        Ball n2 = new Ball(3000,4);
        System.out.print("The 1st ball is deflated: ");
        System.out.println(n1.Deflation());
        System.out.print("The 2nd ball is deflated: ");
        System.out.println(n2.Deflation());
        Book b1 = new Book(400,0.5);
        Book b2 = new Book(400);
        Book b3 = new Book();
        b2.setPricepage(0.7);
        b3.setPages(500);
        b3.setPricepage(0.4);
        System.out.print("Profit b1: ");
        System.out.println(b1.getProfit());
        System.out.print("Profit b2: ");
        System.out.println(b2.getProfit());
        System.out.print("Profit b3: ");
        System.out.println(b3.getProfit());
    }
}