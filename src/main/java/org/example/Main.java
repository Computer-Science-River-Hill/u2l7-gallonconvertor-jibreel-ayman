package org.example; //DO NOT DELETE

import java.util.Scanner;

public static void main(String[] args) {
    // Create a Scanner object to get user input
    Scanner scanner = new Scanner(System.in);

    // Prompt user for the number of gallons
    System.out.print("Enter the number of gallons: ");
    double gallons = scanner.nextDouble();

    // Conversion factors
    double quarts = gallons * 4;           // 1 gallon = 4 quarts
    double pints = gallons * 8;            // 1 gallon = 8 pints (4 quarts * 2 pints)
    double cups = gallons * 16;            // 1 gallon = 16 cups (8 pints * 2 cups)
    double tablespoons = gallons * 256;    // 1 gallon = 256 tablespoons (16 cups * 16 tbsp)

    // Display the results
    System.out.println("\nConversion Results:");
    System.out.println(gallons + " gallon(s) is equivalent to:");
    System.out.println(quarts + " quarts");
    System.out.println(pints + " pints");
    System.out.println(cups + " cups");
    System.out.println(tablespoons + " tablespoons");

    scanner.close();
}
