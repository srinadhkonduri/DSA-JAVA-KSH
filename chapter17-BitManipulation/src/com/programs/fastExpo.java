package com.programs;

public class fastExpo {
    public static void main(String[] args) {
        System.out.println(fastExponential(3,5));
    }
//    creating a method for fast exponential
    public static int fastExponential(int i, int n){
        int ans = 1;
        while (n > 0){
            if ((n & 1) != 0){ // check LSB
                ans = ans * i;
            }
            i = i * i;
            n = n>>1;
        }
        return ans;
    }
}
