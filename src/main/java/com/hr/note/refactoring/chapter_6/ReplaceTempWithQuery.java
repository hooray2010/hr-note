package com.hr.note.refactoring.chapter_6;

/**
 * 重新组织函数：以查询取代临时变量
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class ReplaceTempWithQuery {

  private int quantity;

  private int itemPrice;

  public double getPrice_or() {
    int basePrice = quantity * itemPrice;
    double discountFactor;
    if (basePrice > 1000) {
      discountFactor = 0.95;
    } else {
      discountFactor = 0.98;
    }
    return basePrice * discountFactor;
  }

  /**
   * 局部变量会使代码难以被提炼，所以尽可能的把它们替换为查询式
   * <p>
   * 付出了性能上的代价？
   * 重构时，我们不必担心这些；性能优化阶段通常是在开发后期，到时我们会有更多的选择来解决这个问题。
   *
   * @return
   */
  public double getPrice_op() {
    return basePrice() * discountFactor();
  }

  private int basePrice() {
    return quantity * itemPrice;
  }

  private double discountFactor() {
    if (basePrice() > 1000) {
      return 0.95;
    } else {
      return 0.98;
    }
  }

}
