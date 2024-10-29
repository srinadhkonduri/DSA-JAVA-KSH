package com.patterns;

public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        invPyramid(5);
    }
//    creating a method for printing a inverted half pyramid with numbers
    public static void invPyramid(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
