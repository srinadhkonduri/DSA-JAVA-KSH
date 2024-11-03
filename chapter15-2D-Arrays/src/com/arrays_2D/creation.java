package com.arrays_2D;

import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows and column of the matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

//        output of the code
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,9);
    }
//    creating a linear search method in 2D matrix
    public static boolean search(int[][] matrix, int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key){
                    System.out.println("found key at index" + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
}
