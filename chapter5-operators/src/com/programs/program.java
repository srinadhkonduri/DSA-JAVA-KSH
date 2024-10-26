package com.programs;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
//        creating a calculator program
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num 2 : ");
        int num2 = sc.nextInt();
        System.out.println("add = " + (num1+num2));
        System.out.println("sub = " + (num1-num2));
        System.out.println("mul = " + (num1*num2));
        System.out.println("div = " + (num1/num2));
        System.out.println("mod = " + (num1%num2));
    }
}
