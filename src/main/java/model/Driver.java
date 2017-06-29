package model;

/**
 * Created by hurui on 2017/6/29.
 */
public class Driver extends User {

  private String car;

  public String getCar() {
    return car;
  }

  public void setCar(String car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return super.toString() + "Driver{" +
            "car='" + car + '\'' +
            '}';
  }
}
