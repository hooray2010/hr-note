package cn.zawa.demo.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hurui on 2017/2/25.
 */
public class ShapeTest {
  
  public static void main(String[] args) {
    List<Shape> list = Arrays.asList(new Cirlce(), new Square());
    for (Shape shape : list) {
      //调用子类的toString方法
      shape.draw();
    }
  }
  
}

abstract class Shape {
  void draw() {
    System.out.println("shape draw" + this);
  }
  
  @Override
  public String toString() {
    return "shape";
  }
}

class Cirlce extends Shape {
  void draw() {
    System.out.println("circle draw--" + this);
  }
  
  @Override
  public String toString() {
    return "circle";
  }
  
}

class Square extends Shape {
  void draw() {
    System.out.println("square draw--" + this);
  }
  
  @Override
  public String toString() {
    return "square";
  }
  
}