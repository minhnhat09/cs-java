package com.minhnhat.algo.string;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters1002 {
  public static List<Character> stringtoListChar(String s) {
    List<Character> c = new ArrayList<>();
    for (char ch : s.toCharArray()) {
      c.add(new Character(ch));
    }
    return c;
  }

  public List<String> commonChars(String[] A) {

    return null;
  }


}
