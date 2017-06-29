package model;

import java.util.Comparator;

/**
 * Created by hurui on 2017/6/29.
 */
public class UserComparator implements Comparator<User> {
  
  @Override
  public int compare(User user1, User user2) {
    return user1.getSalary() - user2.getSalary();
  }
  
}
