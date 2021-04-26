package com.shresthabinod.stringAndStringBuilder;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Binod");
        String s2 = new String("Binod");
        System.out.println(s1 == s2); // reference comparison
        System.out.println(s1.equals(s2)); // content comparison as it overrides equals method

        // StringBuilder
        StringBuilder sb1 = new StringBuilder("Binod");
        StringBuilder sb2 = new StringBuilder("Binod");
        System.out.println(sb1 == sb2);// reference/address is compared
        System.out.println(sb1.equals(sb2)); //reference/address is compared
    }
}
