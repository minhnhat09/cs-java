package com.minhnhat.algo.string;

public class DetectCapital520 {
  public static boolean detectCapitalUse(String word) {
    boolean hasUppercase = !word.equals(word.toLowerCase());
    boolean hasLowercase = !word.equals(word.toUpperCase());

    if (hasUppercase && hasLowercase && word.length() > 1) {
      String firstLetter = String.valueOf(word.charAt(0));
      String rest = word.substring(1, word.length());
      if (firstLetter.equals(firstLetter.toUpperCase()) && rest.equals(rest.toLowerCase())) {
        return true;
      }
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(detectCapitalUse("USA"));
    System.out.println(detectCapitalUse("U"));
    System.out.println(detectCapitalUse("a"));
    System.out.println(detectCapitalUse("leetcode"));
    System.out.println(detectCapitalUse("False"));
    System.out.println(detectCapitalUse("FalEe"));
  }
}
