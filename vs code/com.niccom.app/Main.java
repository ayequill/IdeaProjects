import java.util.Scanner;

public class Main{

public static void main(String[] args) {


        System.out.println("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String id = name.next();
        System.out.println("Enter your birth year: ");

        int userInput = name.nextInt();
        int res;
        res = 2020 - userInput;
        System.out.println(id + " " + "Youre " + res + " years Old");

 {
 }
}
}