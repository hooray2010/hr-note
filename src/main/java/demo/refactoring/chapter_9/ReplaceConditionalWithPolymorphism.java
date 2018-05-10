package demo.refactoring.chapter_9;

/**
 * 简化条件表达式：以多态取代条件表达式
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class ReplaceConditionalWithPolymorphism {

  private abstract class EmployeeType {
    private static final String ENGINEER = "engineer";
    private static final String SALESMAN = "salesman";
    private static final String MANAGER = "manager";

    private String typeCode;

    private String getTypeCode() {
      return typeCode;
    }

    //for op
    abstract int payAmount(ReplaceConditionalWithPolymorphism employee);
  }

  private int monthlySalary;
  private int bonus;
  private int commission;
  private EmployeeType type;

  int payAmount_or() {
    switch (getType()) {
      case EmployeeType.ENGINEER:
        return monthlySalary;
      case EmployeeType.SALESMAN:
        return monthlySalary + commission;
      case EmployeeType.MANAGER:
        return monthlySalary + bonus;
      default:
        throw new RuntimeException("Incorrect Employee");
    }
  }

  /**
   * SubClasses or State/Strategy
   *
   * @return
   */
  int payAmount_op() {
    return type.payAmount(this);
  }

  String getType() {
    return type.getTypeCode();
  }

  private class Engineer extends EmployeeType {
    @Override
    int payAmount(ReplaceConditionalWithPolymorphism employee) {
      return employee.getMonthlySalary();
    }
  }

  private class SalesMan extends EmployeeType {
    @Override
    int payAmount(ReplaceConditionalWithPolymorphism employee) {
      return employee.getMonthlySalary() + employee.getCommission();
    }
  }

  private class Manager extends EmployeeType {
    @Override
    int payAmount(ReplaceConditionalWithPolymorphism employee) {
      return employee.getMonthlySalary() + employee.getBonus();
    }
  }

  public int getMonthlySalary() {
    return monthlySalary;
  }

  public int getBonus() {
    return bonus;
  }

  public int getCommission() {
    return commission;
  }
}
