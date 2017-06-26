package model.animal;

/**
 * Created by hurui on 2017/6/26.
 */
public abstract class Animal implements Action {

  public abstract void eat();

  public void work() {
    System.out.println("Do something");
  }

}
