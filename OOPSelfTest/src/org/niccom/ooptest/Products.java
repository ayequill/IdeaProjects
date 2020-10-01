package org.niccom.ooptest;

public class Products {

    private String name;
    private double weight;
    private int price;
    private String egg;


    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void orderDetails (){
        double order = this.price * this.weight;


        System.out.println("Your total is: " + order );
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }




}
