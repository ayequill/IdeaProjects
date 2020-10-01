import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int h = n /100;
    int t = (n % 100) / 10;
    int o = (n % 100) % 10;
    System.out.println(h+t+o);



  }
}