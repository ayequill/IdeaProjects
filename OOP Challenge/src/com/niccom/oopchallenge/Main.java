package com.niccom.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient ("Yaw",26,
                new Eye("Left Eye","Sharp","black",true),
                new Eye("Right Eye","Sharper","Black",true),
                new Heart("Heart","Normal",80),
    new Stomach("Stomach","PUD",false),
    new Skin("Skin","Awesome", "Black",80));

        System.out.println("\tName:" + patient.getName());
        System.out.println("\tAge: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while(!shouldFinish){

            System.out.println("Choose an organ:" +
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().closed();
                        }else{
                            continue;
                        }

                    }else {
                        System.out.println("\t\t1. Open the eye ");
                        if (scanner.nextInt()==1){
                            patient.getLeftEye().open();
                        }else {
                            continue;
                        }
                    }

                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().closed();
                        }else{
                            continue;
                        }

                    }else {
                        System.out.println("\t\t1. Open the eye ");
                        if (scanner.nextInt()==1){
                            patient.getRightEye().open();
                        }else {
                            continue;
                        }
                    }

                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate: ");
                    if (scanner.nextInt()==1){
                        System.out.println("Enter new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to "+ patient.getHeart().getRate());

                    }else   {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest: ");
                    if (scanner.nextInt()==1){

                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish=true;
                    break;
            }
        }


    }
}
