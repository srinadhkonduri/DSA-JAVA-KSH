package com.programs;

import java.util.Scanner;

public class incomeTaxCal {
    public static void main(String[] args) {
        int tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter salary : ");
        int money = sc.nextInt();
        if (money <= 50000){
            System.out.println("no tax");
        } else if (money >= 50000 && money <= 100000){
            tax = money*2;
            System.out.println(tax);
        }
    }
}
