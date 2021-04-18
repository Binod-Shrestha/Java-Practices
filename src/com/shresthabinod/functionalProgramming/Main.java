package com.shresthabinod.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        // stream in java
        List<Student> studentList = Arrays.asList(
                new Student("Binod", "6 Berringer Grove", 35, "Computer Science", 2021),
                new Student("Puja", "6 Berringer Grove", 30, "Beauty", 2021),
                new Student("Punjan", "8 Berringer Grove", 20, "Music", 2021),
                new Student("Aayush", "6 Berringer Grove", 11, "Automation", 2021));
        var newStudentList = studentList.stream()
                .filter(student -> student != null) // not null
                .filter(student -> student.graduation == 2021) // get all who are graduating in 2021
                .filter(student -> student.name.startsWith("P") && student.age == 20) // list of students whose name start with "P" and age is 20
                .collect(Collectors.toList()); // store all the filtered students as list
        System.out.println(newStudentList); // print the list

    }
}
