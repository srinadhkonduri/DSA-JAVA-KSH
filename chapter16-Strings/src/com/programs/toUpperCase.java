package com.programs;

import java.util.Locale;

public class toUpperCase {
    public static void main(String[] args) {
        String str = "hi i am srinadh";
        String str2 = str.toUpperCase(Locale.of(str));
        System.out.println(str2);
    }
}
