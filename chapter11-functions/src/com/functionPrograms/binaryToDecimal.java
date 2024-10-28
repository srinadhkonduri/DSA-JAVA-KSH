package com.functionPrograms;

public class binaryToDecimal {
    public static void main(String[] args) {
        binToDec(1011100111);
    }
    public static void binToDec(int binNum){
        int myNumber = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){
//            acquire last digit for the given number
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//            math.pow always takes double we need to typecast it to int
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of binary number " + myNumber + " = " + decNum);
    }
}
