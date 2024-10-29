package com.patterns;

import java.util.Scanner;

public class HollowRhombus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the rhombus
        System.out.print("Enter the number of rows for the hollow rhombus: ");
        int rows = scanner.nextInt();

        printHollowRhombus(rows);
    }

    // Method to print the hollow rhombus
    public static void printHollowRhombus(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            printSpaces(rows - i);

            // Print the hollow structure of the rhombus
            printHollowLine(rows, i);

            System.out.println();
        }
    }

    // Method to print spaces for alignment
    public static void printSpaces(int count) {
        for (int j = 1; j <= count; j++) {
            System.out.print("  ");
        }
    }

    // Method to print a line of the hollow rhombus
    public static void printHollowLine(int rows, int line) {
        for (int j = 1; j <= rows; j++) {
            if (line == 1 || line == rows || j == 1 || j == rows) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }
}
