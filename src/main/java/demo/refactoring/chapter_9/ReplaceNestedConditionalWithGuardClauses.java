package demo.refactoring.chapter_9;

/**
 * 简化条件表达式：以谓语句取代嵌套条件表达式
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class ReplaceNestedConditionalWithGuardClauses {

  private boolean isDead;

  private boolean isSeparated;

  private boolean isRetired;

  double getPayAmount_or() {
    double result;
    if (isDead) {
      result = deadAmount();
    } else {
      if (isSeparated) {
        result = separatedAmount();
      } else {
        if (isRetired) {
          result = retiredAmount();
        } else {
          result = normalPayAmount();
        }
      }
    }
    return result;
  }

  /**
   * 谓语的精髓：给某一条分支以特别的重视，这种情况比较罕见，如果发生，则提前退出；
   * 而 if-then-else 结构，表明对各分支的重视是同等的。
   * <p>
   * 「单一出口」规则，其实不那么有用，保持代码清晰才是最关键的。
   *
   * @return
   */
  double getPayAmount_op() {
    if (isDead) {
      return deadAmount();
    }
    if (isSeparated) {
      return separatedAmount();
    }
    if (isRetired) {
      return retiredAmount();
    }
    return normalPayAmount();
  }

  private double normalPayAmount() {
    return 4;
  }

  private double retiredAmount() {
    return 3;
  }

  private double separatedAmount() {
    return 2;
  }

  private double deadAmount() {
    return 1;
  }

}

