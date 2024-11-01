package com.sorting;

public class countingSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,9,8};
        System.out.print("before sorting : ");
        printArray(arr);
        count(arr);
        System.out.print("after sorting : ");
        printArray(arr);
    }
//    counting sort
    public static void count(int[] arr){
        int largest  = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
//        sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
//    creating a method for printing the array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
