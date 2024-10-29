package com.patterns;

public class butterflyPattern {
    public static void main(String[] args) {
        butterfly(5);
    }
//    creating a method for printing butterfly pattern
//    1 st half in 1st half we should in ++loop
//    spaces = 2 * n - i;
//    stars = i;
//    2nd half pyramid printing pattern
//    in second half we should print the loop in the reverse order
    public static void butterfly(int n){
//        1st half
//        outer loop
        for (int i = 1; i <= n; i++) {
//            stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            spaces = 2 * n - i
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
//            stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        2nd half of the triangle
        for (int i = n; i >= 1; i--) {
            //            stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            spaces = 2 * n - i
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
//            stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
