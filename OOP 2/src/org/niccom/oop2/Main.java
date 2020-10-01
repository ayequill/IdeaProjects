package org.niccom.oop2;

public class Main {

    public static void main(String[] args) {

        Bird phoenix = new Bird("Nina", "Black", 2, true, 2);
        Dog maltese = new Dog("Lara","White", 2, true);

        System.out.println(phoenix.getName());

        phoenix.eat("seed");
        System.out.println(phoenix.getWings());

        phoenix.fly();

        System.out.println(maltese.getName());
        maltese.eat("Meat");
    }
}
