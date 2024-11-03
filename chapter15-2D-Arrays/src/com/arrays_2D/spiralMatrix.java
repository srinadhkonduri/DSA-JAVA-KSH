package com.arrays_2D;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }
// creating a method for printing spiral matrix
    public static void printSpiral(int[][] matrix){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

//        making a while condition
        while (startRow <= endRow && startCol <= endCol){
//            top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
//            right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
//            bottom
            for (int j = endCol-1; j >= startCol; j--){
                System.out.print(matrix[endRow][j] + " ");
            }
//            left
            for (int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
//            increment starting rows and col
            startCol++;
            startRow++;
//            decrement all ending row and col
            endCol--;
            endRow--;
        }
//        after printing all the values print new line
        System.out.println();
    }
}
