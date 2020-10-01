import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int res = (n/2)*2 + 2;
    System.out.print(res);
  }
}