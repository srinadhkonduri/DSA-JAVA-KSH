package com.sorting;

public class SelectionSortExample {

    // Method to perform Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find the index of the minimum element in the unsorted part
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Unsorted Array:");
        printArray(data);

        // Sort the array using selection sort
        selectionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        printArray(data);
    }
}

