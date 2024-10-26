package com.programs;

import java.util.Scanner;

public class marksAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks of sub1 : ");
        int sub1 = sc.nextInt();
        System.out.print("enter marks of sub2 : ");
        int sub2 = sc.nextInt();
        System.out.print("enter marks of sub3 : ");
        int sub3 = sc.nextInt();
        System.out.print("enter marks of sub4 : ");
        int sub4 = sc.nextInt();
        System.out.print("enter marks of sub5 : ");
        int sub5 = sc.nextInt();
        System.out.print("enter marks of sub6 : ");
        int sub6 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("your total marks are " + sum + " out of 600");
        if (sum >= 550){
            System.out.println("your grade is A");
        } else if (sum >= 500 && sum <= 550) {
            System.out.println("your grade is B");
        } else if (sum >= 400 && sum <= 300) {
            System.out.println("your garde is C");
        } else if (sum >= 300 && sum <= 250) {
            System.out.println("your grade is D");
        } else {
            System.out.println("failed");
        }
    }
}
