package rabbits;

public class Test {

  static class C {

  }

  @org.junit.Test
  public void t() {
    C c = (C) null;
    System.out.println(c);
  }
}
