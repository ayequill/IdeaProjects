import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here

    Scanner scanner = new Scanner(System.in);
    short n = scanner.nextShort();
    short k = scanner.nextShort();

    System.out.println(k%n);

  }
}