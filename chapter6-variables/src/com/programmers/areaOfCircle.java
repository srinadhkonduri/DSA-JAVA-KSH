package com.programmers;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        double pie = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle : ");
        double rad = sc.nextDouble();
        double ans = (pie*(rad*rad));
        System.out.println(ans);
    }
}
