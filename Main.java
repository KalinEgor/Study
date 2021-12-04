package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.selectionSort();
        student.PrintScr();
    }
}

class Student {

    public int arr[];

    public Student() {
        arr = new int[7];
        arr[0] = 56;
        arr[1] = 78;
        arr[2] = 45;
        arr[3] = 101;
        arr[4] = 33;
        arr[5] = 102;
        arr[6] = 1;
    }

    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length - 1; j++)
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : arr) {
            System.out.println(aIdNumber);
        }
    }
}