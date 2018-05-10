package demo.tij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hurui on 2017/3/1.
 */
public class IOTest {

  public static void main(String[] args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = stdin.readLine()) != null && s.length() != 0) {
      System.out.println(s);
    }
  }

}
