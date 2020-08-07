package com.minhnhat.element.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TransformOneStringToAnother197 {
  public String candidateString;
  public Integer distance;

  public TransformOneStringToAnother197(String candidateString, Integer distance) {
    this.candidateString = candidateString;
    this.distance = distance;
  }

  public static int transformString(Set<String> D, String s, String t) {
    Queue<TransformOneStringToAnother197> q = new LinkedList<>();
    D.remove(s);
    q.add(new TransformOneStringToAnother197(s, 0));
    TransformOneStringToAnother197 f;
    while ((f = q.poll()) != null) {
      if (f.candidateString.equals(t)) {
        return f.distance;
      }
      String str = f.candidateString;
      for (int i = 0; i < str.length(); i++) {
        String strStart = i == 0 ? "" : str.substring(0, i);
        String strEnd = i + 1 < str.length() ? str.substring(i + 1) : "";
        for (int j = 0; j < 26; j++) {
          String modStr = strStart + (char) ('a' + j) + strEnd;
          if (D.remove(modStr)) {
            q.add(new TransformOneStringToAnother197(modStr, f.distance + 1));
          }
        }
      }
    }
    return -1;
  }
}
