package com.minhnhat.element.essentialalgo;

import java.util.ArrayList;

public class BinarySearch {
  public static int bSearch(int value, ArrayList<Integer> nums) {
    int l = 0, u = nums.size() - 1;
    while (l <= u) {
      int m = (l + u) / 2;
      if (nums.get(m) < value) {
        l = m + 1;
      } else if (nums.get(m) == value) {
        return m;
      } else {
        u = m - 1;
      }
    }
    return -1;
  }
}
