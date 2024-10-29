package com.patterns;

public class diamondPattern {
    public static void main(String[] args) {
        diamond(5);
    }
//    creating a pattern for printing the diamond
    public static void diamond(int n){
//        1 st half
//        outer loop
        for (int i = 1; i <= n; i++) {
//            1st half left part
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            1 st half second half
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        2 nd loop
//        down part of the diamond pattern
//        here the loop should run from the backward
        for (int i = 1; i <= n; i++) {
//            2nd half 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print("* ");
            }
//            second half second part
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
