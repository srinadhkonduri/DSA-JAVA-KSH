package com.patterns;

public class palindromePattern {
    public static void main(String[] args) {
        palindromePat(5);
    }
//    method for palindrome pattern
    public static void palindromePat(int n){
//        outer loop
        for (int i = 1; i <= n; i++) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
//            descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
//            ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
