package com.minhnhat.element.strings;

public class InterconvertStringInteger71 {
  public static int stringToInt(String s) {
    int x = 0;
    for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.toCharArray().length; i++) {
      final int digit = s.charAt(i) - '0';
      x = x * 10 + digit;
    }
    return s.charAt(0) == '-' ? -x : x;
  }

  public static String intToString(int x) {
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
    }
    StringBuilder s = new StringBuilder();
    do {
      s.append((char) ('0' + Math.abs(x % 10)));
      x /= 10;
    } while (x != 10);
    if (isNegative) {
      s.append('-');
    }
    s.reverse();
    return s.toString();
  }

  public static void main(String[] args) {
    System.out.println(intToString(123));
  }
}
