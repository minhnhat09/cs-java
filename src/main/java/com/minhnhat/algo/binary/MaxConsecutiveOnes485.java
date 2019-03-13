package com.minhnhat.algo.binary;

public class MaxConsecutiveOnes485 {
  public static void main(String[] args) {
    int[] n1 = {1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
    int[] n3 = {1, 1};
    int[] n2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0};
    // System.out.println(findMaxConsecutiveOnes(n3));
    System.out.println(findMaxConsecutiveOnes(n1));
    // System.out.println(findMaxConsecutiveOnes(n2));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int max = 0;
    int i = 0;
    while (i < nums.length) {

      while (i < nums.length && nums[i] == 1) {
        count++;
        i++;
      }
      if (count > max) {
        max = count;
      }
      count = 0;
      i++;
    }

    return max;
  }
}
