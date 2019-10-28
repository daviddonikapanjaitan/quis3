package com.company;

public class Soal05 {

    public static void main(String[] args) {
        double population = 30000, growth = 0.03, exceed = 100000;
        double j  = 0, year = 0, growthyear = 0;
        System.out.println("Current Population: " + population);
        System.out.println("Rate population increase: 3%");
        System.out.println("Result: ");
        while (population < exceed){
            growthyear = population;
            growthyear = growthyear + (growth * growthyear);
            population = growthyear;
            j++;
        }
        System.out.println("Year-"+j);
    }

    /*The population of a town is now at 30000 and is expanding at a rate of 3% per year. Write a
    Java program to determine how many years it will take for the population to exceed 100000.*/
}
