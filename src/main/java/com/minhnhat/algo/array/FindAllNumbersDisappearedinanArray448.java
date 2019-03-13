package com.minhnhat.algo.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray448 {
  public static void main(String[] args) {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    findDisappearedNumbers(nums);
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> l = new ArrayList<>();
    for (int i = 1; i < nums.length+1; i++) {
      boolean iInNums = false;
      for (int n : nums) {
        if (i == n) {
          iInNums = true;
        }
      }
      if (!iInNums) {
        l.add(i);
      }
    }
    return l;
  }

}
