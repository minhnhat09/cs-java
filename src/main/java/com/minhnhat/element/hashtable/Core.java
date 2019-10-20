package com.minhnhat.element.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Core {
  public static List<List<String>> findAnagrams(List<String> dictionary) {
    Map<String, List<String>> sortedStringToAnagrams = new HashMap<>();
    for (String s : dictionary) {
      // get char array and sort string
      char[] sortedArray = s.toCharArray();
      Arrays.sort(sortedArray);
      String sortedString = new String(sortedArray);
      if (sortedStringToAnagrams.containsKey(sortedString)) {
        sortedStringToAnagrams.get(sortedString).add(s);
      } else {
        sortedStringToAnagrams.put(sortedString, new ArrayList<>());
      }
    }
    List<List<String>> results = new ArrayList<>();
    for (Map.Entry<String, List<String>> p : sortedStringToAnagrams.entrySet()) {
      if (p.getValue().size() >= 2) {
        results.add(p.getValue());
      }
    }
    return results;
  }
}