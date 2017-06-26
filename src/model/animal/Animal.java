package model.animal;

/**
 * Created by hurui on 2017/6/26.
 */
public abstract class Animal implements Action {

  public Animal() {
    System.out.println("Animal construct...");
  }

  public abstract void eat();

  public void work() {
    System.out.println("Do something...");
  }

}
