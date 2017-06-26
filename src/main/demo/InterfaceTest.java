package main.demo;

import model.animal.Action;
import model.animal.Animal;
import model.animal.Cat;
import model.animal.Dag;

/**
 * Created by hurui on 2017/6/26.
 */
public class InterfaceTest {

  public static void main(String[] args) {

    testAbstract();
  }

  /**
   * 测试继承、实现体系
   */
  private static void testAbstract() {
    Animal cat = new Cat();
    Action cat1 = new Cat();
    Animal dog = new Dag();

    cat.eat();
    cat1.eat();
    dog.eat();

    System.out.println("******");

    cat.work();
    cat1.work();
    dog.work();
  }

}
