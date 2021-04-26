package com.shresthabinod.inheritance;

public class Cat extends Animal{
    @Override
    public void walk() {
        System.out.println("x I walk slow...");
    }

    @Override
    public void eat() {
        System.out.println("x I eat rats...");
    }

    @Override
    public void speak() {
        System.out.println("meow meow meow ...");
    }
}
