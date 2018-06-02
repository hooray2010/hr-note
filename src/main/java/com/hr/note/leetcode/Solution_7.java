package com.hr.note.leetcode;

/**
 * Created by hurui on 2018/5/17.
 */
public class Solution_7 {

  public static void main(String[] args) {
    int x = -2147483648; //该值会溢出！！！
    int res = reverse2(x);
    System.out.println(res);
  }

  public static int reverse(int x) {
    long res = 0L;
    int temp = Math.abs(x);
    while (temp > 0) {
      res = res * 10 + temp % 10;
      if (res > Integer.MAX_VALUE) {
        return 0;
      }
      temp /= 10;
    }
    return (int) (x > 0 ? res : -res);
  }

  public static int reverse2(int x) {
    //正负值不对称
    if (x == Integer.MIN_VALUE) {
      return 0;
    }
    int temp = Math.abs(x);
    String origin = Integer.toString(temp);
    StringBuffer sb = new StringBuffer(origin);
    String result = sb.reverse().toString();
    if (Long.parseLong(result) > Integer.MAX_VALUE) {
      return 0;
    }
    return x > 0 ? Integer.parseInt(result) : -Integer.parseInt(result);
  }

}
