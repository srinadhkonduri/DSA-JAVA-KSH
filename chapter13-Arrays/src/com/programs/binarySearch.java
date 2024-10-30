package com.programs;

public class binarySearch {
    public static void main(String[] args) {
//        numbers in the array should be in the sorted form
        int[] number = {11,12,13,14,15,16,17};
        int target = 16;
        int ans = binSearch(number,target);
        if (target == -1){
            System.out.println("element not found");
        } else {
            System.out.println("answer found at the index : " + ans);
        }
    }
//    creating a method to implement binary search
    public static int binSearch(int[] number,int target){
//        starting should be from 0 and ending should be from array.length -1
        int st = 0; int end = number.length-1;
        while (st <= end){
            int mid = st + (end - st)/ 2;
            if (number[mid] == target){
                return mid;
            }
            if (number[mid] < target){ // right
                st = mid + 1;
            } else { // left
                end = mid -1;
            }
        }
        return -1;
    }
}
