package com.programs;

public class subString {
    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(subSt(str,0,5));
    }
//    creating a method for subString
    public static String subSt(String str, int st, int end){
        String subStr = "";
        for (int i = st; i < end; i++) {
            subStr += str.charAt(i);

        }
        return subStr;
    }
}
