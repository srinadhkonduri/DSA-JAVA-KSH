package com.programs;

public class reverseGivenNumber {
    public static void main(String[] args) {
        int n = 290303;
        while (n > 0){
            int lastNumber = n % 10;
            System.out.print(lastNumber + " ");
            n /= 10;
        }
        System.out.println();
    }
}
