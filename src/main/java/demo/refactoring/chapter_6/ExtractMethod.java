package demo.refactoring.chapter_6;

/**
 * 重新组织函数：提炼函数
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class ExtractMethod {

  private String name;

  private double amount;

  /**
   * origin method
   *
   * @param amount
   */
  public void printOwing_origin(double amount) {
    printBanner();

    //print details
    System.out.println("name = " + name);
    System.out.println("amount = " + amount);
  }

  /**
   * optimized method
   * <p>
   * 一个函数多长才算合适？
   * 这个根本不是问题，关键在于函数名称和函数本体之间的语义距离。
   * 就算函数名称比提炼出来的代码还长也无所谓
   * 提炼函数时，都会给你一个解释自己意图的机会。
   * <p>
   * 优点：
   * 1、代码自解释，无需多余注释
   * 2、提高了复用性，仅需修改唯一位置
   *
   * @param amount
   */
  public void printOwing_optimized(double amount) {
    printBanner();
    printDetails(amount);
  }

  private void printDetails(double amount) {
    System.out.println("name = " + name);
    System.out.println("amount = " + amount);
  }

  private void printBanner() {
  }

}
