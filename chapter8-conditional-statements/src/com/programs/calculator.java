package com.programs;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
//        creating a calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a : ");
        int a = sc.nextInt();
        System.out.print("enter number b : ");
        int b = sc.nextInt();
        System.out.print("enter which operation to perform + - * / % : ");
        char ch = sc.next().charAt(0); // for taking input for character
        switch (ch) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("invalid");
        }
    }
}
