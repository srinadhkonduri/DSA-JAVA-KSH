package com.programs;

public class getIthBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(23,3));
        System.out.println(getIthBit(10,2));
        System.out.println(clearIthBit(15,2));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIthBits(15,1));
        System.out.println(clearingIthBit(10,2,4));
        System.out.println(powerOfTwo(4));
        System.out.println(countSetBits(12));
    }
//    creating a method for getting the ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
//    creating a method for getting the ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

//    creating a method for clearIthBit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(i<<1);
        return (n & bitMask);
    }
//    creating a method for updatingIthBit
    public static int updateIthBit(int n, int i, int newBit){
        n = clearIthBit(n,i);
        int bitMask = newBit<<1;
        return n | bitMask;
    }
//    creating a method for clearIthBits
    public static int clearIthBits(int n, int i){
        int bitMask = ((~0)<<i);
        return n | bitMask;
    }
//    creating a method for clearing ith bits
    public static int clearingIthBit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
//    creating a method to check a number is power of two or not
    public static boolean powerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
//    creating a method for counting set bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while (n  > 0){
            if ((n & 1) != 0){                 // check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
