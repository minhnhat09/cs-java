package com.minhnhat.algo.number;

public class AddDigits258 {
  public static int sumMember(int num) {
    String s = String.valueOf(num);
    int total = 0;
    for (char c : s.toCharArray()) {
      total += Character.getNumericValue(c);
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(addDigits(38));
  }

  public static int addDigits(int num) {
    while (num > 9) {
      num = sumMember(num);
    }

    return num;
  }
}
