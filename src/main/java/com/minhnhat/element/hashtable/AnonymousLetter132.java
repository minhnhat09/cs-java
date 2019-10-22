package com.minhnhat.element.hashtable;

import java.util.HashMap;
import java.util.Map;

public class AnonymousLetter132 {
  public static boolean isLetterConstructibleFromMagazine(String letterText, String magazineTexString) {
    Map<Character, Integer> charFrequencyForLetter = new HashMap<>();
    for (int i = 0; i < letterText.length(); i++) {
      char c = letterText.charAt(i);
      if (charFrequencyForLetter.containsKey(c)) {
        charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) + 1);
      } else {
        charFrequencyForLetter.put(c, 1);
      }
    }

    // check if the characters of the magazine can cover characters in letter
    for (int i = 0; i < magazineTexString.length(); i++) {
      char c = magazineTexString.charAt(i);
      if (charFrequencyForLetter.containsKey(c)) {
        charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) - 1);
        if (charFrequencyForLetter.get(c) == 0) {
          charFrequencyForLetter.remove(c);
        }
        if (charFrequencyForLetter.isEmpty()) {
          break;
        }
      }
    }
    return charFrequencyForLetter.isEmpty();
  }
}