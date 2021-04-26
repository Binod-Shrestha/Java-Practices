package com.shresthabinod.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

         List<Student> studentList = Arrays.asList(
                new Student("Binod", "Shrestha", "6 Berringer Grove", 35, "Computer Science", 2021),
                new Student("Puja", "Shrestha","6 Berringer Grove", 30, "Beauty", 2021),
                new Student("Punjan", "Lama", "8 Berringer Grove", 20, "Music", 2021),
                new Student("Aayush", "Shrestha", "6 Berringer Grove", 11, "Automation", 2021));


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
        filterStudent(studentList);

        //stream with map and filter
        mapStudent(studentList);

    }

    private static void mapStudent(List<Student> studentList) {
         studentList.stream()
                 .peek(System.out::println) // prints the list
                 .map(Student::getFirstName)
                 .filter(name -> name.startsWith("B"))
                 .map(name -> name.toUpperCase())
                 .distinct()
                 .forEach(System.out::println);
    }

    private static void filterStudent(List<Student> studentList) {

        studentList.stream()
                .peek(System.out::println) // prints the list
                .filter(student -> student != null) // not null
                .filter(student -> student.graduation == 2021) // get all who are graduating in 2021
                .filter(student -> student.firstName.startsWith("P") && student.age == 20) // list of students whose name start with "P" and age is 20
                .collect(Collectors.toList())// store all the filtered students as list
                .forEach(System.out::println);  // print the list

    }


    public static interface StudentInterface {
        void grade();
        default void result(){

            System.out.println("Passed");
        }
        static void graduation(){

            System.out.println("2021");
        }
         static String displayName(String firstName, String lastName){
            return firstName + " " + lastName;
        }
    }
}
