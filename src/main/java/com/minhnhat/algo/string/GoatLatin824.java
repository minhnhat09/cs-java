package com.minhnhat.algo.string;

import java.util.Arrays;
import java.util.List;

public class GoatLatin824 {
  public static String toGoatLatin(String S) {
    final List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
    String[] split = S.split(" ");
    for (int i = 0; i < split.length; i++) {
      if (vowels.contains(String.valueOf(split[i].charAt(0)).toLowerCase())) {
        split[i] += "ma";
      } else {
        if (split[i].length() > 1) {
          split[i] = split[i].substring(1, split[i].length())+split[i].charAt(0);
        }
        split[i] += "ma";
      }
      for (int j = 0; j < i+1; j++) {
        split[i] += "a";
      }
    }
    return String.join(" ", split);
  }

  public static void main(String[] args) {
    String phrase = "I speak Goat Latin";
    System.out.println(toGoatLatin(phrase));
  }
}
