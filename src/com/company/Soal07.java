package com.company;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "";
        int j = 0;
        System.out.print("Please input: ");
        text = scan.nextLine();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == ' '){
                j = (j + 1);
            }
        }
        System.out.println("Word: " + (j + 1));
    }

    /*Write a Java program that prompts the user to enter a message and then displays the number
    of words it contains. For example, if the string entered is “Java Bootcamp With Xsis Academy”,
    the program should display “The message entered contains 5 words”. Assume that the words
    are separated by a single space character.
            Hint: Use the length() method to get the number of characters that the given message
    contains.*/
}
