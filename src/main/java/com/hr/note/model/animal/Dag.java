package com.hr.note.model.animal;

/**
 * Created by hurui on 2017/6/26.
 */
public class Dag extends Animal implements Action {

  @Override
  public void eat() {
    System.out.println("Eat bone...");
  }

  @Override
  public void work() {
    System.out.println("Watch door...");
  }

}
