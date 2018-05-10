package demo.tij;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hurui on 2017/11/11.
 */
public class TypeTest {

  public <K, V> void test(K k, V v) {

  }

  public static <A> Collection<A> test1() {
    return null;
  }

  public static <A> List<A> test2() {
    return null;
  }

  public static <A> LinkedList<A> test3(A a) {

    return null;
  }

  public static void main(String[] args) {
    Class clz1 = int.class;
    Class clz2 = Integer.class;
    System.out.println(clz1);
    System.out.println(clz2);
    System.out.println(int.class == Integer.class);

    List<?> list = new ArrayList<>();
    list.add(null);
  }

}
