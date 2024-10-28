package com.functionPrograms;

public class decimalToBinary {
    public static void main(String[] args) {
        decTOBin(7);
    }
//    creating a function tha converts dec to bin
    public static void decTOBin(int n){
        int myNumber = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n =n/2;
        }
        System.out.println("binary number of " + myNumber + " = " + binNum);
    }
}
