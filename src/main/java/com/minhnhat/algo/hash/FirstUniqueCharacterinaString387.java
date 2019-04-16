package com.minhnhat.algo.hash;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacterinaString387 {
  public static int firstUniqChar(String s) {
    if (s.length() == 1) {
      return 0;
    }
    List<Character> lr= new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      boolean repeat = false;
      for (int j = i+1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          repeat = true;
          lr.add(s.charAt(i));
          break;
        }
      }
      if (!lr.contains(s.charAt(i)) && repeat == false) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(firstUniqChar("dddccdbba"));
    // System.out.println(firstUniqChar("loveleetcode"));
  }
}
