package com.shresthabinod.enums;

public class Main {
    public static void main(String[] args) {

        Days firstDay = Days.MONDAY;
        Days secondDay = Days.TUESDAY;
        System.out.println("First Day: " + firstDay);
        System.out.println("Second Day: "+ secondDay);

        // enums with if statements
        System.out.println("<===== IF STATEMENT ==========>");
        if(firstDay == Days.MONDAY){
            System.out.println(firstDay);
        } else if( secondDay == Days.TUESDAY) {
            System.out.println(secondDay);
        }
        else {
            System.out.println("Not Monday");
        }

        // enum with fields
        System.out.println("<=== Enum with fields Example===>");
        Level highLevel = Level.HIGH;
        System.out.println("Code: "+ highLevel.getLevelCode());


        // enum with switch
        System.out.println("<========= SWITCH STATEMENT========>");
        Level level = Level.LOW;
        switch (level){
            case LOW:
                System.out.println(Level.LOW);break;

            case MEDIUM:
                System.out.println(Level.MEDIUM);break;
            case HIGH:
                System.out.println(Level.HIGH);break;
            default:
                System.out.println(" General Level");

        }

        // enums with value.of
        System.out.println("<=== Enum with values examples ===>");

        Days days = Days.MONDAY;
        Days[] listDays = Days.values();
        for (Days lDays : listDays) {
            System.out.println(lDays.ordinal()+". "+lDays); // ordinal provides the index
        }

    }


}
