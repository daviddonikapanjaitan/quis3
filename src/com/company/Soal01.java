package com.company;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, j = 0, average = 0, sum = 0;
        int input = 0;
        System.out.print("Please input N-Number: ");
        input = scan.nextInt();
        while (i < input){
            System.out.print("Input Number-"+(i+1)+": ");
            j = scan.nextInt();
            sum = sum + j;
            i++;
        }
        average = sum / input;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


        /*Write a Java program that lets the user enter N numbers and then calculates and displays their
        sum and their average. The value of N should be given by the user at the beginning of the
        program.*/

    }

}
