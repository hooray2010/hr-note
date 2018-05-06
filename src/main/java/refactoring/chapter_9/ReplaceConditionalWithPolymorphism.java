package refactoring.chapter_9;

/**
 * 简化条件表达式：以多态取代条件表达式
 * <p>
 * Created by hurui on 2018/5/6.
 */
public class ReplaceConditionalWithPolymorphism {

  private class EmployeeType {
    private static final String ENGINEER = "engineer";
    private static final String SALESMAN = "salesman";
    private static final String MANAGER = "manager";

    private String typeCode;

    private String getTypeCode() {
      return typeCode;
    }
  }

  private int monthlySalary;
  private int bonus;
  private int commission;
  private EmployeeType type;

  int payAmount() {
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

  String getType() {
    return type.getTypeCode();
  }

}
