package demo;

import lol.model.skill.FlashSS;
import model.SexEnum;
import model.User;
import model.UserComparator;
import org.junit.Test;

import java.util.*;

/**
 * Created by hurui on 2017/6/29.
 */
public class CollectionTest {
  
  public static void main(String[] args) throws Exception {
    List<? extends User> userList = new ArrayList<>();
    //userList.add(new Driver());
  }
  
  /**
   * TreeSet不能存入null，比较排序需要compare
   * HashSet可以存入null，无序用的哈希值
   * <p>
   * <? extends T>
   * T的子类，接受对象的时候
   * <? super T>
   * T的父类，调用方法的时候，子父类都实现类Comparable接口，方法重写；
   * <p>
   * TreeMap容器内的对象必须实现Comparable接口
   * 传入比较器，新的比较策略
   */
  @Test
  public void testTreeSet() {
    //TreeSet不能存入null，比较排序需要compare
    //HashSet可以存入null，无序用的哈希值
    Set<String> stringSet = new TreeSet<>();
    stringSet.add("C");
    stringSet.add("B");
    stringSet.add("a");
    System.out.println(stringSet);
    
    Set<String> stringOrderSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    stringOrderSet.add("C");
    stringOrderSet.add("B");
    stringOrderSet.add("a");
    System.out.println(stringOrderSet);
    
    //TreeMap容器内的对象必须实现Comparable接口
    User user1 = new User("老王", SexEnum.MALE, 40, 10000);
    User user2 = new User("小李", SexEnum.FEMALE, 20, 20000);
    
    Set<User> userSet = new TreeSet<>();
    userSet.add(user1);
    userSet.add(user2);
    System.out.println(userSet);
    
    //传入比较器，新的比较策略
    Set<User> userOrderSet = new TreeSet<>(new UserComparator());
//    userOrderSet.add(user1);
//    userOrderSet.add(user2);
    userOrderSet.addAll(userSet);
    System.out.println(userOrderSet);
  }
  
  /**
   * 比较器：策略模式
   */
  @Test
  public void testComparator() {
    List<String> stringList = new ArrayList<>();
    Collections.addAll(stringList, "C", "B", "a");
    System.out.println(stringList);
    stringList.sort(String.CASE_INSENSITIVE_ORDER);
    System.out.println(stringList);
    stringList.sort((s1, s2) -> {
      int n1 = s1.length();
      int n2 = s2.length();
      int min = Math.min(n1, n2);
      for (int i = 0; i < min; i++) {
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);
        if (c1 != c2) {
          c1 = Character.toUpperCase(c1);
          c2 = Character.toUpperCase(c2);
          if (c1 != c2) {
            c1 = Character.toLowerCase(c1);
            c2 = Character.toLowerCase(c2);
            if (c1 != c2) {
              // No overflow because of numeric promotion
              return c2 - c1;
            }
          }
        }
      }
      return n2 - n1;
    });
    System.out.println(stringList);
  }
  
  /**
   * 测试hashcode
   */
  @Test
  public void testHashCode() {
    //System.out.println(null);
    System.out.println("A hashcode：" + "A".hashCode());
    System.out.println("a hashcode：" + "a".hashCode());
    System.out.println("A".hashCode() + 32 == "a".hashCode());
    System.out.println('a' - 'A');
    System.out.println("flash".hashCode());
    System.out.println(new FlashSS().hashCode());
  }
  
}
