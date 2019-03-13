package com.minhnhat.algo.number;

public class HappyNumber202 {
  public static boolean isHappy(int n) {
    int count = 0;
    while (n != 1 && count < 1000) {
      n = squareSum(n);
      count++;
    }
    System.out.println(count);
    return n == 1;
  }

  public static int squareSum(int num) {
    String s = String.valueOf(num);
    int total = 0;
    for (char c : s.toCharArray()) {
      int val = Character.getNumericValue(c);
      total += val * val;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }

}
