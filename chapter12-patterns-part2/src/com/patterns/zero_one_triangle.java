package com.patterns;

public class zero_one_triangle {
    public static void main(String[] args) {
        zero_one(5);
    }
//    creating a method for printing the zero one pattern
    public static void zero_one(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ( (i+j) % 2 == 0){ // even
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
