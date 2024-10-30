package com.programs;

import java.util.Scanner;

public class linearSearch {
    public static int linSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return the index if element is found
            }
        }
        return -1;  // return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Perform linear search
        int result = linSearch(arr, target);

        // Display the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}

