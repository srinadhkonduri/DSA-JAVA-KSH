package com.leetCodeProblems;

public class maximumSubArrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        subArray(arr);
    }
//    creating a method to print max sub Array using brute force approach
public static void subArray(int[] arrs){
//        outer loop
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arrs.length; i++) {
        int start = arrs[i];
        for (int j = i; j < arrs.length; j++) {
            int end = arrs[j];
            for (int k = start; k <= end; k++) {
                currSum += arrs[k];
            }
            System.out.println(currSum);
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("max subArrays : " + maxSum);
}
}
