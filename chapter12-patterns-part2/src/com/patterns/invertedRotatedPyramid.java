package com.patterns;

public class invertedRotatedPyramid {
    public static void main(String[] args) {
        invPyramid(4);
    }
//    inverted rotated pattern
    public static void invPyramid(int n){
        for (int i = 1; i <= n; i++) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
//            stars
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
