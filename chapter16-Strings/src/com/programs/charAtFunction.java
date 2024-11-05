package com.programs;

public class charAtFunction {
    public static void main(String[] args) {
        String firstName = "srinadh";
        String lastname = "konduri";
        String fullName = firstName + " " + lastname;
        printLetter(fullName);
    }
//    creating a method for printing every letter in the string
    public static void printLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
