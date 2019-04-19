package com.minhnhat.algo.dynamicprogramming;

public class RangeSumQueryImmutable303 {
  int[] nums;
  public RangeSumQueryImmutable303(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int i, int j) {
    if(i==j){
      return nums[i];
    }
    return nums[i] + sumRange(i + 1, j);
  }

  public static void main(String[] args) {
    RangeSumQueryImmutable303 rangeSumQueryImmutable303 = new RangeSumQueryImmutable303(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(rangeSumQueryImmutable303.sumRange(0,2));
    System.out.println(rangeSumQueryImmutable303.sumRange(2,5));
    System.out.println(rangeSumQueryImmutable303.sumRange(0,5));
  }
}
