public class Producer extends Thread {
  private Channel c;

  public Producer(Channel c) {
    this.c = c;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      c.put("msg_" + i);
    }
    c.put("DONE");
  }
}