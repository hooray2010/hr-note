package refactoring.chapter_9;

import java.util.Date;

/**
 * 简化条件表达式：分解条件表达式
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class DeComposeConditional {

  private static final Date SUMMER_START = new Date();
  private static final Date SUMMER_END = new Date();

  private Date date;
  private int quantity;
  private double winterRate;
  private double winterServiceCharge;
  private double summerRate;

  double getCharge_or() {
    double charge;
    if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
      charge = quantity * winterRate + winterServiceCharge;
    } else {
      charge = quantity * summerRate;
    }
    return charge;
  }

  /**
   * 将 if、then、else 各个段落分别提炼函数
   * 条件分支虽然很短，但在代码意图与代码自身之间的的差距却很大
   *
   * @return
   */
  double getCharge_op() {
    double charge;
    if (notSummer(date)) {
      charge = winterCharge(quantity);
    } else {
      charge = summerCharge(quantity);
    }
    return charge;
  }

  private boolean notSummer(Date date) {
    return date.before(SUMMER_START) || date.after(SUMMER_END);
  }

  private double summerCharge(int quantity) {
    return quantity * summerRate;
  }

  private double winterCharge(int quantity) {
    return quantity * winterRate + winterServiceCharge;
  }

}
