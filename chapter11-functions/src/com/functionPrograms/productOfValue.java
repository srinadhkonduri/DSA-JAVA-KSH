package com.functionPrograms;

import java.util.Scanner;

public class productOfValue {
    public static void main(String[] args) {
        System.out.println(multiply(4,6));
    }
    public static int multiply(int a, int b){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        int mul = a * b;
        System.out.println("mul = " + mul);
        return mul;
    }
}
