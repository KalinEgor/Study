package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static int withoutnulls(int a, int b){
        if(a==0){
            return 1;
        }
        if(a==1){
            return b+1;
        }
        if((a>1)&&(b==0)) {
            return 0;
        }
        else {
            return withoutnulls(a-1,b-1)+withoutnulls(a,b-1);
        }
    }
    public static int reverse(int n, int a)
    {
        if (n == 0) {
            return a;
        }
        else {
            return reverse(n / 10, 10 * a + n % 10);
        }
    }
    public static int reverse(int n){
        return reverse(n,0);
    }
    public static void nechet() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                nechet();
            } else {
                nechet();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(withoutnulls(3,4));
        System.out.print(reverse(123456789));
        nechet();
    }
}
