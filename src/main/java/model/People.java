package model;

/**
 * Created by hurui on 2017/6/30.
 */
public class People {
  
  private int age;
  private SexEnum sexEnum;
  
  public SexEnum getSexEnum() {
    return sexEnum;
  }
  
  public void setSexEnum(SexEnum sexEnum) {
    this.sexEnum = sexEnum;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
}
