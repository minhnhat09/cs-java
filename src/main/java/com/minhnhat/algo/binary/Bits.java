package com.minhnhat.algo.binary;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bits {
  public static String numtoBinary(double num) {
    String s = "";
    while (num / 2 >= 0.5) {
      if (num % 2 == 0) {
        s = "0" + s;
      } else {
        s = "1" + s;
      }
      num = Math.floor(num / 2);
    }
    return s;
  }

  public static int binaryToNum(String binary) {
    binary = new StringBuilder(binary).reverse().toString();
    int total = 0;
    List<String> s = new ArrayList<>(Arrays.asList(binary.split("")));
    for (int i = 0; i < s.size(); i++) {
      if ("1".equals(s.get(i))) {
        total += Math.pow(2, i);
      }
    }
    return total;
  }

  public static String addBinary(String a, String b) {
    int total = binaryToNum(a) + binaryToNum(b);
    if (total == 0) {
      return "0";
    }
    return numtoBinary(total);
  }

  public static void main(String[] args) {
    System.out.println(
        addBinary(
            "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
            "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
  }
}
