package com.company;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, j = 0;
        String k = "";
        do{
            System.out.print("Please input Number[Except 0]: ");
            i = scan.nextInt();
            if(i != 0){
                k = k + i + " ";
            }
        }while(i != 0);
        System.out.println("Displayed[Except 0]: " + k);
    }

    /*Write a Java program that lets the user enter numeric values repeatedly until the value 0 is
    entered. When data input is completed, the product of the numbers entered should be displayed.
            (The last 0 entered should not be included in the final product.)*/
}
