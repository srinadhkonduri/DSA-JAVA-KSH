package com.programs;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
//        checking if a given number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a random number : ");
        int n = sc.nextInt();
//        checking number is prime or not
        if (n == 2){
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

    }
}
