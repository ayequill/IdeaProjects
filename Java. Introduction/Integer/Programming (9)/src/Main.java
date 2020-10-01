import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scan = new Scanner(System.in);
    short a = scan.nextShort();
    short b = scan.nextShort();
    short c = scan.nextShort();

    int onye = (a/2 + a%2) + (b/2 + b%2) + (c/2 + c%2);
    System.out.println(onye);

  }
}