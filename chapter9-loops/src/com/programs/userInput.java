package com.programs;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any random number : ");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0){
                System.out.println("you entered multiple of 10");
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
