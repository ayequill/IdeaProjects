package org.niccom.oop2;

public class Animal {

    private String name;
    private String color;
    private int legs;
    private boolean hasTales;

    public Animal(String name, String color, int legs, boolean hasTales) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTales = hasTales;


    }

    public void eat (String food){

        System.out.println("Eating " + food);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTales() {
        return hasTales;
    }

    public void setHasTales(boolean hasTales) {
        this.hasTales = hasTales;
    }
}