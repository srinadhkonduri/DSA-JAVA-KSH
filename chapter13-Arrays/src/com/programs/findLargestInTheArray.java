package com.programs;

public class findLargestInTheArray {
    public static void main(String[] args) {
        int[] number = {12,13,11,15,17};
        int ans= findLargest(number);
        System.out.println(ans);
    }
//    creating a method for finding Largest number in the array
    public static int findLargest(int[] number){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
//        running the loop till end of the loop
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]){
                largest = number[i];
            }
            if (smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest number is :" + smallest);
//        it is very important to return
//        largest number in the return type
        return largest;
    }
}
