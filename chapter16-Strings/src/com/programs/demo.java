package com.programs;

import java.util.Scanner;

public class demo {
//    strings are IMMUTABLE
    public static void main(String[] args) {
//        taking input as a string
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // taking only a single sentence
        System.out.println("name = : " + name.length());

    }
}
