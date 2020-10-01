package com.niccom.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Guess_Game {

    public static void main(String[] args) {

        System.out.println("Guess the Number game!");
        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        System.out.println("Welcome " + username);

        System.out.println("Can we start the game now?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        int decision = scanner.nextInt();

        while (decision != 1) {

            System.out.println("Can we start the game now?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            decision = scanner.nextInt();


        }


        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println("Please guess a number:");
        int ans = scanner.nextInt();

        int trys = 0;
        boolean won = false;
        boolean done = false;

        while (!done) {
            trys++;

            if (trys < 5) {

                if (number == ans) {
                    won = true;
                    done = true;

                }else if (ans > number){
                    System.out.println("Guess lower");
                    ans = scanner.nextInt();
                }else {
                    System.out.println("Guess higher");
                    ans = scanner.nextInt();
                }
            }else {
                done = true;
            }

        }if (won){
            System.out.println("Congratulations! You have guess correct in your " + trys + " guess" );

        }else {
            System.out.println("Game over");
            System.out.println("the number was "+ number);
        }
    }
}

