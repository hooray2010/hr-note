package model;


/**
 * Created by hurui on 2017/2/13.
 */
public class User implements Comparable<User> {
  
  private String name;
  private SexEnum sex;
  private int age;
  private int salary;
  
//  {
//    this.name = "老王";
//  }
  
  public User() {
    //this.setName("小王");
  }
  
  public User(String name, SexEnum sex, int age, int salary) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.salary = salary;
  }
  
  @Override
  public int compareTo(User user) {
    return this.age - user.getAge();
  }
  
  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", sex=" + sex +
        ", age=" + age +
        ", salary=" + salary +
        '}';
  }
  
  /*
    getter and setter
     */
  public void setName(String name) {
    this.name = name;
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
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public int getSalary() {
    return salary;
  }
  
  public void setSalary(int salary) {
    this.salary = salary;
  }
}
