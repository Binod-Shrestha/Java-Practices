package com.shresthabinod.inheritance;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("x I eat bones");
    }

    @Override
    public void speak() {
       System.out.println("how how how ....");
    }

    @Override
    public void walk() {
        System.out.println("x I can walk and run.");
    }
}
