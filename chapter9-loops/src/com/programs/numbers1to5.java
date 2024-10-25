package com.programs;

import java.util.Scanner;

public class numbers1to5 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter numbers you want to print : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
