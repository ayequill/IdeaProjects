import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    //put your code here
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    int a = (k/100);
    int b = (k/10%10);
    int c = k-(k/10*10);
    System.out.println(c+""+b+""+a);

  }
}