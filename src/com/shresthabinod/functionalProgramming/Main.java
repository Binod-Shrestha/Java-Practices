package com.shresthabinod.functionalProgramming;

public class Main {
    public static void main(String[] args) {
        StudentInterface studentInterface = () -> System.out.println("My grade is: A+");
        studentInterface.grade();
        studentInterface.result();
        StudentInterface.graduation();

        // Calculation interface
        Calculation calculation = (a,b) ->  a + b;
        System.out.println(calculation.plus(10, 20));
        var minus = calculation.minusNum(50,20);
        System.out.println(minus);
    }
}
