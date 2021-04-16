package com.shresthabinod.functionalProgramming;

public interface Calculation {
    public int plus(int a, int b);
    default int minusNum(int a, int b){
        return a - b;
    }
    public static int squareNum(int n){
        return n*n;
    }
}
