package demo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created by hurui on 2017/7/15.
 */
public class SignTest implements Cloneable {

  @Test
  public void testSign() throws CloneNotSupportedException {
    int count = -128;
    int size = 8;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(size);
    byteArrayOutputStream.write(count);
    byte[] bytes = byteArrayOutputStream.toByteArray();
    for (byte b : bytes) {
      System.out.println(Integer.toBinaryString(b));
    }
  }

}
