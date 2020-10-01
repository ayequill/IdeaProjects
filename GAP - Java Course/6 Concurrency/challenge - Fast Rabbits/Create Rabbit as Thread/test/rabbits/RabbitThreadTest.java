package rabbits;

import org.junit.Assert;
import org.junit.Test;
import rabbits.RabbitThread;

public class RabbitThreadTest {
  @Test
  public void whenRabbitThreadStarted_rabbitShouldRun() throws InterruptedException {
    RabbitThread r1 = new RabbitThread(1);
    r1.start();
    Assert.assertTrue(r1.isAlive());
    r1.join();
    Assert.assertFalse(r1.isAlive());
  }
}