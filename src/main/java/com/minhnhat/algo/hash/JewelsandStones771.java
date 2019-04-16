package com.minhnhat.algo.hash;

public class JewelsandStones771 {
  public static int numJewelsInStones(String J, String S) {
    int count = 0;
    for (int i = 0; i < J.length(); i++) {
      for (int j = 0; j < S.length(); j++) {
        if (J.charAt(i) == S.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    System.out.println(numJewelsInStones("z", "ZZ"));
  }
}
