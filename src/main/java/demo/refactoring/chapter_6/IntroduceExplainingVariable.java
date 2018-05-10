package demo.refactoring.chapter_6;

/**
 * 重新组织函数：引入解释型变量
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class IntroduceExplainingVariable {

  private int quantity;

  private int itemPrice;

  double getPrice_or() {
    //price is base price - quantity discount + shipping
    return quantity * itemPrice
            - Math.max(0, quantity - 500) * itemPrice * 0.05
            + Math.min(quantity * itemPrice * 0.1, 100.0);
  }

  double getPrice_op1() {
    final double basePrice = quantity * itemPrice;
    final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
    final double shipping = Math.min(quantity * itemPrice * 0.1, 100.0);
    return basePrice - quantityDiscount + shipping;
  }

  /**
   * 在何时引入解释型变量呢？
   * 如果处理一个拥有大量局部变量的方法，直接使用 Extract Method 并不容易；
   * 我们应该先使用此方法清理代码，然后再考虑下一步怎么做。
   *
   * @return
   */
  double getPrice_op2() {
    return basePrice() - quantityDiscount() + shipping();
  }

  private double shipping() {
    return Math.min(quantity * itemPrice * 0.1, 100.0);
  }

  private double quantityDiscount() {
    return Math.max(0, quantity - 500) * itemPrice * 0.05;
  }

  private double basePrice() {
    return quantity * itemPrice;
  }

}
