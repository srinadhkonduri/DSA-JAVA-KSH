package com.patterns;

public class charPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            char ch = 'a';
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch += 1;
            }
            System.out.println();
        }
    }
}
