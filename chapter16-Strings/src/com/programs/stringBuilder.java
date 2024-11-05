package com.programs;

public class stringBuilder {
    public static void main(String[] args) {
//        string builder is used in java to create a mutable classes
//        which we can modify later in the sessions
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
//            System.out.println(sb); // if we print here we call numbers
        }
        System.out.println(sb);
    }
}
