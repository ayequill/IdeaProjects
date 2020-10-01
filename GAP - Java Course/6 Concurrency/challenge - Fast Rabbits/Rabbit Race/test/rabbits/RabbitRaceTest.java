package rabbits;

import org.junit.Assert;
import org.junit.Test;

public class RabbitRaceTest {
  @Test
  public void shouldCreateRabbitRunnable() {
    RabbitRace rabbitRace = new RabbitRace();
    Thread thread = rabbitRace.getCorrespondingRabbitImplementation(1);

    Assert.assertTrue(thread instanceof Thread);
  }
}