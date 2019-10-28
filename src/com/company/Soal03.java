package com.company;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 5;
        int i = 0, j = 0, k = 0;
        while (i<input){
            do{
                System.out.print("Please input [Digit 100-999] Number-"+(i+1)+": ");
                j = scan.nextInt();
            }while (j < 100 || j > 999);
            k = k + j;
            i++;
        }
        System.out.println("Display sum: " + k);
    }
    /*Write a Java program that lets the user enter 5 integers and then calculates and displays the
    sum of those that consist of three digits.
    Hint: All three-digit integers are between 100 and 999.*/
}
