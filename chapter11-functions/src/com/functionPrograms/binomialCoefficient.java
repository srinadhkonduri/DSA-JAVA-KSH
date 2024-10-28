package com.functionPrograms;

public class binomialCoefficient {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate binomial coefficient C(n, k)
    public static long binomialCoefficient(int n, int k) {
        if (k > n) {
            return 0;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        int n = 5;  // Set the value of n
        int k = 2;  // Set the value of k

        System.out.println("Binomial Coefficient C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
    }
}
