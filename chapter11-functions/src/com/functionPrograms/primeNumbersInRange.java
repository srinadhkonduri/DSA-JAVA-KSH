package com.functionPrograms;

public class primeNumbersInRange {
    public static void main(String[] args) {
        primeNumber(30);
    }
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
    public static void primeNumber(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
