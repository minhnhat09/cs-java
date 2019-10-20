package com.minhnhat.element.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TestPalindrome131 {
  public static boolean canFormPalindrome(String s) {
    Map<Character, Integer> mapChars = new HashMap<>();
    for (char c : s.toCharArray()) {
      if (mapChars.containsKey(c)) {
        mapChars.put(c, mapChars.get(c) + 1);
      } else {
        mapChars.put(c, 1);
      }
    }
    int count = 0;
    for (Map.Entry<Character, Integer> p : mapChars.entrySet()) {
      if (p.getValue() % 2 != 0 && ++count > 1) {
        return false;
      }
    }
    return true;
  }
}