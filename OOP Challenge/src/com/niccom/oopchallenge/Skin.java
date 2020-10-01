package com.niccom.oopchallenge;

public class Skin extends Organ{

    private String color;
    private int softness;


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color: " + this.getColor());

    }

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
