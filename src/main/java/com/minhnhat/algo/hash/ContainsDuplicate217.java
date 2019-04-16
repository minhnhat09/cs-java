package com.minhnhat.algo.hash;

import java.util.HashMap;

public class ContainsDuplicate217 {
  public static boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.get(nums[i]) == null) {
        map.put(nums[i], 1);
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    System.out.println(containsDuplicate(new int[]{1,2,3,4}));
  }
}
