package com.functionPrograms;

import java.util.Scanner;
// java always call by value

public class functionSyntax {
    public static void main(String[] args) {
        hello(); // function call
        calculate();
        System.out.println(calculateSum(4,5));
    }
//    creating a function for printing hello world
    public static void hello(){
        System.out.println("hello world");
    }
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
    public static int calculateSum(int sum1, int sum2){
        int sum = sum1+sum2;
        return sum;
    }
}
