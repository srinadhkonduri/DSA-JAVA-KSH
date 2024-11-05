package com.programs;

public class palindrome {
//    A word is a palindrome if the word is
//    spelled as same from first and last
    public static void main(String[] args) {
        String str = "madam";
        palin(str);
    }
//    creating a method for checking a word is palindrome
    public static boolean palin(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n-1-i)){
                System.out.println(str +" = word is a palindrome");
                return true;
            } else {
                System.out.println("word is not a palindrome");
            }
        }
        return false;
    }
}
