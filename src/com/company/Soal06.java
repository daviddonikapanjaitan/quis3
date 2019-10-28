package com.company;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0, i = 0, j = 0, k = 0;
        int average = 0;
        System.out.print("Please input Number-N: ");
        input = scan.nextInt();
        while(i < input){
            System.out.print("Please inpunt Number-"+(i+1)+": ");
            j = scan.nextInt();
            k = k + j;
            average = k / input;
            i++;
        }
        System.out.println("Average: " + average);
    }

    /*Write a Java program that prompts the user to enter N numbers and then calculates and displays
    their average value. The value of N should be given by the user at the beginning of the program.
    Add all necessary checks to make the program satisfy the property of definiteness.*/
}
