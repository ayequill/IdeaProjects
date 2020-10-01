package org.niccom.oop2;

public class Dog extends Animal{

    public Dog(String name, String color, int legs, boolean hasTales) {
        super(name,
                color,
                legs,
                hasTales);
    }

    @Override
    public void eat(String food) {
        System.out.println("Chewing " + food);
    }
}
