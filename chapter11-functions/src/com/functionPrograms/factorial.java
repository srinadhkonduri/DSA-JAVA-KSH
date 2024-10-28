package com.functionPrograms;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
//    creating a function for returning factorial
    public static int fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // returning factorial for the following number
    }
}
