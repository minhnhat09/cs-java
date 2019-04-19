package com.minhnhat.algo.binary;

import java.util.Arrays;

public class TwoSumIIInputarrayissorted167 {
  public static int[] twoSum(int[] numbers, int target) {
    int[] re = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      int i1 = binarySearch(numbers, target - numbers[i], 0, numbers.length);
      System.out.println(i1);
      if (i1 != -1) {
        re[0] = i;
        re[1] = i1;
        return re;
      }
    }
    return re;
  }

  public static int binarySearch(int[] numbers, int target, int lowIndex, int highIndex) {
    if (highIndex < lowIndex) {
      return -1;
    }
    int middle = (lowIndex + highIndex) / 2;
    int middeValue = numbers[middle];
    if (target == middeValue) {
      return middle;
    } else if (target < middeValue) {
      return binarySearch(numbers, target, lowIndex, middle);
    } else if (target > middeValue) {
      return binarySearch(numbers, target, middle + 1, highIndex);
    }
    return -1;
  }

  public static int[] subArray(int[] array, int beg, int end) {
    return Arrays.copyOfRange(array, beg, end);
  }

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    System.out.println(Arrays.toString(twoSum(numbers, 9)));
  }
}
