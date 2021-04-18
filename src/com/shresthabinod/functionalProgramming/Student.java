package com.shresthabinod.functionalProgramming;

public class Student {
String name;
String address;
int age;
String program;
int graduation;

    public Student(String name, String address, int age, String program, int graduation) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.program = program;
        this.graduation = graduation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getGraduation() {
        return graduation;
    }

    public void setGraduation(int graduation) {
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", program='" + program + '\'' +
                ", graduation=" + graduation +
                '}';
    }
}