package com.sorting;

public class InsertionSortExample {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0 to i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
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
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted Array:");
        printArray(data);

        // Sort the array using insertion sort
        insertionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        printArray(data);
    }
}

