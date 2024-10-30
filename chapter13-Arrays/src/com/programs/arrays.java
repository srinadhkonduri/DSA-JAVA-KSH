package com.programs;

public class arrays {
    public static void main(String[] args) {
//        creating an array and updating the values using a function
        int marks[] = {97,98,99};
        int nonChangeable = 5;
        update(marks);
        System.out.println(nonChangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
    public static void update(int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
