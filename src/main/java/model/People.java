package model;

/**
 * Created by hurui on 2017/6/30.
 */
public class People {
  
  private int age;
  private SexEnum sexEnum;
  
  @Override
  public int hashCode() {
    return 1;
  }
  
  @Override
  public boolean equals(Object obj) {
    return this.hashCode() == obj.hashCode();
  }
  
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
