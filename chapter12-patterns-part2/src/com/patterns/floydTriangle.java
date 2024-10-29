package com.patterns;

public class floydTriangle {
    public static void main(String[] args) {
        floydTri(5);
    }
//    creating a method for floyd triangle
    public static void floydTri(int n){
//        for incrementing all the numbers one by one we create
//        a variable outside the two loop
//        for printing same line from starting of every number
//        we should variable form the complete of the first loop
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                sum += 1;
            }
            System.out.println();
        }
    }
}
