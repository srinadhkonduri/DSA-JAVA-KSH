package com.programmers;

public class typeConversion {
    public static void main(String[] args) {
//        type compatible
//        destination type > source type
        int marks = (int)(99.44f); // this is type casting
        int a = 25;
        long b = a;
        System.out.println(b);
        System.out.println(marks);
    }
}
