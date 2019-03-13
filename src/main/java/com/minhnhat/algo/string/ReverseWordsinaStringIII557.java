package com.minhnhat.algo.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinaStringIII557 {
  public static String reverseWords(String s) {
    List<String> l = new ArrayList<>();
    String[] split = s.split(" ");
    for (int i = 0; i < split.length; i++) {
      l.add(new StringBuilder(split[i]).reverse().toString());
    }
    return String.join(" ", l);
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("Let's take LeetCode contest"));
  }
}
