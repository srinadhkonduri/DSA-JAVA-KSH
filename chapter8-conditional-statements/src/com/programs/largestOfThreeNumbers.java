package com.programs;

import java.util.Scanner;
// the logic behind this code is very simple
// just comparing the numbers
// A >= B && A >= C A IS GREATER
// B >= C B IS GREATER
// C IS GREATER

public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("enter num3 : ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+" num1 is greater");
        } else if (num2 >= num3) {
            System.out.println(num2 + " num2 is greater");
        } else {
            System.out.println(num3+" num3 is greater");
        }
    }
}
