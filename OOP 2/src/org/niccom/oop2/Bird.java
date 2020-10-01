package org.niccom.oop2;

public class Bird extends  Animal {

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTales, int wings) {
        super(name, color, legs, hasTales);
        this.wings = wings;
    }


    @Override
    public void eat(String food) {
        System.out.println("Plucking " + food);
    }

    public void fly(){

        System.out.println(this.getName() + " is flying");
    }
    
    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
