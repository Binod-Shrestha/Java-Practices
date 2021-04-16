package com.shresthabinod.ternaryOperator;

public class Main {
    public static void main(String[] args) {
        //Example:01
        String textCase = "uppercase";
        String firstName = textCase.equals("uppercase") ? "BINOD" : "binod";
        System.out.println(firstName);


        // Example - 2
        int age1 = 40;
        int age2 = 25;

        int older = age1 >= age2 ? age1 : age2;
        int younger = age1 <=age2 ? age1 : age2;
        System.out.println("Older age is : " + older);
        System.out.println("Younger age is : "+younger);
    }
}
