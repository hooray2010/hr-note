package com.hr.note.leetcode;

/**
 * Created by hurui on 2018/5/18.
 */
public class Solution_9 {

  public static void main(String[] args) {
    int x = 1;
    System.out.println(isPalindrome(x));
  }

  private static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int div = 1;
    while (x / div >= 10) {
      div *= 10;
    }

    while (x > 0) {
      int left = x / div;
      int right = x % 10;
      if (left != right) {
        return false;
      }
      x = (x % div) / 10;
      div /= 100;
    }
    return true;
  }

}
