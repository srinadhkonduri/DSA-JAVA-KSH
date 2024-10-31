package com.programs;

public class printSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        subArray(arr);
    }
//    creating a method to print sub array
    public static void subArray(int[] arr){
//        outer loop
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            for (int j = i; j < arr.length; j++) {
                int end = arr[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArrays : " + ts);
    }
}
