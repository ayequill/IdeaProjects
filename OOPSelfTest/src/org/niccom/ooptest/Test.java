package org.niccom.ooptest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Products broiler  = new Products("Fresh Dressed Broiler", 17 );
        Products layer = new Products("Fresh Dressed Layer", 20);
        Products cockerel = new Products("Fresh Dressed Cockerel", 25);
        Products eggGrade1 = new Products("Grade 1",22);
        Products eggGrade2 = new Products("Grade 2", 21);

        System.out.println("Choose product: ");
        System.out.println("\t1. "+ broiler.getName() + "\t2. " + layer.getName() + "\t3. " + cockerel.getName() );
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println("Enter weight of Product");

        double weight = input.nextDouble();

        switch (userInput){
            case 1:
               broiler.setWeight(weight);
               broiler.orderDetails();
                break;
            case 2:
                layer.setWeight(weight);
                layer.orderDetails();
                break;
            case 3:
                cockerel.setWeight(weight);
                cockerel.orderDetails();
                break;
            default:
                break;
        }

    }

}
