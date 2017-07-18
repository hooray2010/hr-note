package algs;

import edu.princeton.cs.algs4.*;
import org.junit.Test;

/**
 * Created by hurui on 2017/7/18.
 */
public class Interval2DTest {

  /**
   * 测试二维间隔的API
   */
  @Test
  public void test2D() {
    Interval1D xInterval = new Interval1D(.2, .5);
    Interval1D yInterval = new Interval1D(.5, .6);
    Interval2D box = new Interval2D(xInterval, yInterval);
    box.draw();

    Counter c = new Counter("hits");
    for (int t = 0; t < 10000; t++) {
      double x = Math.random();
      double y = Math.random();
      Point2D p = new Point2D(x, y);
      if (box.contains(p)) {
        c.increment();
      } else {
        p.draw();
      }
    }

    StdOut.println(c);
    StdOut.println(box.area());

    pause();
  }

  // pause
  private void pause() {
    while (true) {
    }
  }

}
