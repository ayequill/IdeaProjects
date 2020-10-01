import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    System.out.println((x%100)/10);
  }
}