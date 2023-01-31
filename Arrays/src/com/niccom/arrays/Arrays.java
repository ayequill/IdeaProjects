package com.niccom.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        String[] students = new String[5];
//        students[0] = "Nick";
//        students[1] = "Kwabena";
//        students[2] = "Quill";
//        students[3] = "Kobby";
//        students[4] = "Lamar";
//
//        System.out.println(students[1]);
//        String[] products = new String[]{"Broiler", "Cockerel", "Layer", "Eggs"};
//        int [] prices = {10,20,35};
//
//    for (int i=0; i<students.length; i++ ){
//            System.out.println(students[i]);
//
//        }

        String[] names = {"Nick", "Quill", "Kwabena","Lamar", "Siaw", "Kobby"};
        int [] number = {235173, 312233, 21312312, 312311, 12312321, 213123};

        for (int contacts = 0; contacts<names.length; contacts++  ){

            System.out.println(names[contacts]);
        }

        System.out.println("Please enter a name");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();

        for (int search = 0; search< names.length; search++){
            if (input.equals(names[search])){

                System.out.println(number[search]);
            }

        }
    }
}
