package com.functionPrograms;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        table();
    }
//    creating a function to print a number table
    public static void table(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number of table you want : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
