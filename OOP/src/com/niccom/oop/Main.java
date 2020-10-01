package com.niccom.oop;

public class Main {

    public static void main(String[] args) {

        Phone iPhone =  new Phone("iPhone 11", 6.5, 8, 12);

        System.out.println(iPhone.getName());

        System.out.println("Screen Size is " + iPhone.getScreenSize());



        iPhone.playMusic("GKMC");
        iPhone.playMusic("Section.80");


        Phone pixel = new Phone("Pixel 3", 12);

        System.out.println(pixel.getName() + " And " + pixel.getMemoryRam() + " Gigs of RAM");



    }

}
