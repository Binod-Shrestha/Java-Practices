package com.shresthabinod.functionalProgramming;

public interface StudentInterface {
    void grade();
    default void result(){
        System.out.println("Passed");
    }
    static void graduation(){
        System.out.println("2021");
    }
}
