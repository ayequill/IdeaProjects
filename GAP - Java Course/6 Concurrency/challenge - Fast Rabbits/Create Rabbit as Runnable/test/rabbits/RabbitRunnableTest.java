package rabbits;

import org.junit.Assert;
import org.junit.Test;

public class RabbitRunnableTest {
  @Test
  public void whenRabbitRunnableIsPassedToAThread_rabbitShouldRun() throws InterruptedException {
    RabbitRunnable runnable = new RabbitRunnable(1);
    Thread t = new Thread(runnable);
    t.start();
    Assert.assertTrue(t.isAlive());
    t.join();
    Assert.assertFalse(t.isAlive());
  }
}