package com.shresthabinod.inheritance;

public class Human extends Animal{
    @Override
    public void speak() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("I eat rice and daal");
    }

    @Override
    public void walk() {
        System.out.println("I can walk, run and jump");
    }
}
