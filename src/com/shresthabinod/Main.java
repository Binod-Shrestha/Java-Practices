package com.shresthabinod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Binod",39,"Brampton", "Male"));
        studentList.add(new Student("Aayush",11,"Brampton", "Male"));
        studentList.add(new Student("Puja",35,"Brampton", "Female"));

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        intList.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
        studentList.stream()
                .filter((x) -> x.age < 30 && x.gender == "Male")
                .forEach(System.out::println);
    }
}
