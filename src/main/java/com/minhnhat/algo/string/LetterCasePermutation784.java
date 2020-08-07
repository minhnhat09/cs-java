package com.minhnhat.algo.string;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784 {
  public static void main(String[] args) {
    letterCasePermutation("a5b");
  }

  public static List<String> letterCasePermutation(String S) {
    List<String> strings = new ArrayList<>();
    for (char c : S.toCharArray()) {
      strings.add(String.valueOf(c));
    }
    for (String e : strings) {
      e.toUpperCase();
    }
    return null;
  }
}
