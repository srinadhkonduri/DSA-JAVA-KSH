package com.functionPrograms;

public class isPrimeOrNot {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
//    creating a function to check if a number is prime or not
    public static boolean isPrime(int n){
        if (n == 2){ // corner case
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                return true;
            }
        }
        return true;
    }
}
