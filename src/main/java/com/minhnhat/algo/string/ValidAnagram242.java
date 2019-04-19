package com.minhnhat.algo.string;

import java.util.Arrays;

public class ValidAnagram242 {
  // Method to sort a string alphabetically
  public static String sortString(String inputString)
  {
    // convert input string to char array
    char tempArray[] = inputString.toCharArray();

    // sort tempArray
    Arrays.sort(tempArray);

    // return new sorted string
    return new String(tempArray);
  }
  public boolean isAnagram(String s, String t) {
    return sortString(s).equals(sortString(t));
  }
  public static void main(String[] args) {


  }
}
