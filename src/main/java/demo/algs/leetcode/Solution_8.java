package demo.algs.leetcode;

/**
 * Created by hurui on 2018/5/17.
 */
public class Solution_8 {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    String str = "   ";
    System.out.println(myAtoi(str));
  }

  public static int myAtoi(String str) {
    if (str.isEmpty()) {
      return 0;
    }
    int sign = 1, base = 0, i = 0, n = str.length();
    //去除前端空格
    while (i < n && str.charAt(i) == ' ') {
      ++i;
    }
    //判断符号位
    if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
      sign = (str.charAt(i++) == '+') ? 1 : -1;
    }
    //ASCII
    while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      //若溢出
      if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      base = 10 * base + (str.charAt(i++) - '0');
    }
    return base * sign;
  }

}
