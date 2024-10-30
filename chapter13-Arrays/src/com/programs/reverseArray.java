package com.programs;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        revArray(arr);
        System.out.print("reversed array : ");
        printArray(arr);
    }
//    creating a method to reverse an array
    public static void revArray(int[] arr){
        int st = 0; int end = arr.length-1;
        while (st <= end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
//    creating a method for printing array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
