package com.shresthabinod.enums;

public class Main {
    public static void main(String[] args) {

        Days firstDay = Days.MONDAY;
        Days secondDay = Days.TUESDAY;
        System.out.println("First Day: " + firstDay);
        System.out.println("Second Day: "+ secondDay);

        // enums with if statements
        if(firstDay == Days.MONDAY){
            System.out.println(firstDay);
        } else if( secondDay == Days.TUESDAY) {
            System.out.println(secondDay);
        }
        else {
            System.out.println("Not Monday");
        }

        // enum with fields
        Level highLevel = Level.HIGH;
        System.out.println("Code: "+ highLevel.getLevelCode());


        // enum with switch
        Level level = Level.LOW;
        switch (level){
            case LOW:
                System.out.println(Level.LOW);break;

            case MEDIUM:
                System.out.println(Level.MEDIUM);break;
            case HIGH:
                System.out.println(Level.HIGH);

        }

        // enums with value.of

        Days days = Days.MONDAY;
        Days[] listDays = Days.values();
        for (Days lDays : listDays) {
            System.out.println(lDays);
        }

    }


}
