package model.animal;

/**
 * Created by hurui on 2017/6/26.
 */
public class Cat extends Animal implements Action {

  @Override
  public void eat() {
    System.out.println("Eat fish...");
  }

}
