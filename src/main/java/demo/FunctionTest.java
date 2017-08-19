package demo;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntBinaryOperator;

/**
 * Created by hurui on 2017/6/2.
 */
public class FunctionTest {

  public static void main(String args) {

    sum();
    DoubleSupplier doubleSupplier = () -> 42;
    getStringConsumer();
  }

  private static void sum() {
    IntBinaryOperator intBinaryOperator = (int x, int y) -> x + y;
  }

  private static Consumer<String> getStringConsumer() {
    return (String s) -> System.out.println(s);
  }

}
