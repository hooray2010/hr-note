package model;

import model.insurance.Insurer;

/**
 * Created by hurui on 2017/2/13.
 */
public class User extends Insurer {

  private String name;
  private SexEnum sex;

  {
    this.name = "老王";
  }

  public User() {
    //this.setName("小王");
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            '}';
  }

  public String getName() {
    return name;
  }

  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }
}
