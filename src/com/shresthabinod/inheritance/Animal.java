package com.shresthabinod.inheritance;

public class Animal implements AnimalInterface {
    String name;
    int age;
    int weight;
    String color;

    public Animal() {
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public void speak() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
