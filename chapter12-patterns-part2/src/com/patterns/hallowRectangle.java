package com.patterns;

public class hallowRectangle {
    public static void main(String[] args) {
        hallowRectangle(4,5);
    }
//    creating a method for printing hallow rectangle pattern
    public static void hallowRectangle(int totRows, int totCol){
//        outer loop
        for (int i = 1; i <=totRows ; i++) {
//            inner lop
            for (int j = 1; j <=totCol ; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCol){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
