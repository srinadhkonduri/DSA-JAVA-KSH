package com.leetCodeProblems;

public class KadanesAlgorithm {

    // Method to find maximum subArray sum using Kadane's Algorithm
    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // Example array
        int maxSum = maxSubArraySum(numbers);
        System.out.println("Maximum subArray sum is: " + maxSum);
    }
}

