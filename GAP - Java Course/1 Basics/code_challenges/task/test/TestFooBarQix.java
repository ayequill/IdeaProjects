import org.junit.experimental.theories.Theory;

import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.assertEquals;

public class TestFooBarQix {

  public static Map<Integer, String> dataPoints = Map.ofEntries(
          entry(1, "123"),
          entry(2, "2"),
          entry(3, "Foo"),
          entry(4, "4"),
          entry(5, "BarBar"),
          entry(6, "Foo"),
          entry(7, "QixQix"),
          entry(8, "8"),
          entry(9, "Foo"),
          entry(10, "Bar"),
          entry(13, "Foo"),
          entry(15, "FooBarBar"),
          entry(21, "FooQix"),
          entry(33, "FooFooFoo"),
          entry(51, "FooBar"),
          entry(53, "BarFoo")
  );

  @Theory
  public void test() {
    TaskFooBarQix task = new TaskFooBarQix();
    for (Map.Entry<Integer, String> entry : dataPoints.entrySet()) {
      assertEquals(task.compute(entry.getKey()), entry.getValue());
    }
  }
}
