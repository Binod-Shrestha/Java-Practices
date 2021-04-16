package com.shresthabinod.lambdaExpression;

public class Main {
    public static void main(String[] args) {

        // no params

//addNumbers(5,4);
        Speak speak = () -> System.out.println("Hello");
        speak.talk();

// Functional-2
        addNumbers(4,5);


    }
    public static void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    interface Speak{
        public void talk();
    }

    interface AddNumber{
        public  void add(int a, int b);
    }



    /***
     * Lambda Expressions
     * no access modifier
     * no return type
     * ***************************
     * 1. any number of arguments
     * 2. for one-argument lambda expression parenthesis are optional
     * 3. parenthesis are mandatory
     * 4. curly brace: (a,b) -> sop(a+b); = optional
     * 5. curly braces: (a,b) -> sop(a+b);
     *                           sop(a*b); = mandatory
     *
     */


    //Functional Interfaces
    /**
     * 1. Runnable -> run();
     * 2. Callable -> call();
     * 3. Comparable -> compareTo();
     * 4. SAM -> Single Abstract Method
     */


}
