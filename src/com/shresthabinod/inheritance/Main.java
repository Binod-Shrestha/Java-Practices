package com.shresthabinod.inheritance;

public class Main {
    public static void main(String[] args) {
    Animal dog1 = new Dog();
    dog1.setAge(14);
    dog1.setName("Oscar");
    dog1.setWeight(35);
    dog1.setColor("black & Yellow");
        System.out.println("----- Animal: Dog -----");
    System.out.println(dog1.toString());
        dog1.eat();
        dog1.speak();
        dog1.walk();

        // cat
        Animal cat = new Cat();
        cat.setName("Catherine");
        cat.setAge(2);
        cat.setColor("White");
        cat.setWeight(25);
        System.out.println("----- Animal: Cat -------");
        System.out.println(cat.toString());
        cat.walk();
        cat.speak();
        cat.eat();

        //Human Being
        Animal human = new Human();
        human.setName("Binod");
        human.setAge(39);
        human.setWeight(70);
        human.setColor("Brown");
        System.out.println("------ Animal: Human --------");
        System.out.println(human.toString());
        human.speak();
        human.walk();
        human.eat();

    }
}
