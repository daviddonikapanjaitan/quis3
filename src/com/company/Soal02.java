package com.company;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {
        int input = 0, i = 0, j = 0, sum = 0, sum1 = 0, z = 0;
        String x = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input Number-N: ");
        input = scan.nextInt();
        while(i < input){
            System.out.print("Please input Number-"+(i+1)+": ");
            j = scan.nextInt();
            //sum = (int) (sum + (j * Math.pow(10,  i )));
            if(j % 2 == 0){
                sum1 = (int) ( (sum1 * 10)  + j );
                x = x + j  + ",  ";
            }
            i++;
        }
        System.out.println("Even Display Integer: " + sum1);
        System.out.println("Even Display String: " + x);
    }

    /*Write a Java program that lets the user enter N integers and then calculates and displays the
    product of those that are even. The value of N should be given by the user at the beginning of
    the program.*/
}
