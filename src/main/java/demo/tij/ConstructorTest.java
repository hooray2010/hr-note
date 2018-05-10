package demo.tij;

import model.SexEnum;
import model.User;
import model.insurance.Insurer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by hurui on 2017/2/13.
 */
public class ConstructorTest {

  public static void main(String[] args) {
    //testForEach();
    //testConstructor();
    //testVarArgs();
    //testEnum();
    testFields();
  }

  private static void testFields() {
    Insurer insurer = new Insurer();
    List<Field> fieldList = new ArrayList<>();

    fieldList.addAll(Arrays.asList(insurer.getClass().getDeclaredFields()));
    System.out.println(fieldList);

    fieldList.addAll(Arrays.asList(insurer.getClass().getSuperclass().getDeclaredFields()));
    System.out.println(fieldList);
  }

  private static void testEnum() {
    Insurer user = new Insurer();
    user.setSexEnum(SexEnum.MALE);
    System.out.println(user.getSexEnum());
  }

  private static void testVarArgs(Object... args) {
    //args = null;
    for (Object o : args) {
      System.out.println(o + "AAA");
    }
    System.out.println("BBB");
  }

  private static void testConstructor() {
    User user = new User();
    System.out.println(user);
  }

  private static void testForEach() {
    Random random = new Random(47);
    float[] f = new float[10];
    for (int i = 0; i < 10; i++) {
      f[i] = random.nextFloat();
    }
    for (float x : f) {
      System.out.println(x);
    }
  }

}
