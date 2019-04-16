package com.minhnhat.algo.hash;

import java.util.Arrays;
import java.util.HashMap;

public class SetMismatch645 {
  public static int[] findErrorNums(int[] nums) {
    HashMap<Integer, Integer> m = new HashMap<>();
    Arrays.sort(nums);
    int[] n = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if(i+1 != nums[i] && n[1]==0) {
        n[1] = i+1;
      }
      if (m.get(nums[i]) == null) {
        m.put(nums[i], 1);
      } else {
        n[0] = nums[i];
        Integer integer = m.get(nums[i]);
        integer++;
        m.put(nums[i], integer++);
      }
    }
    return n;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9})));
  }
}
