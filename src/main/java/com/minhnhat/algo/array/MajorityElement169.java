package com.minhnhat.algo.array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement169 {
  public static void main(String[] args) {
    int[] n1 = {3, 2, 3};
    int[] n2 = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(n1));
    System.out.println(majorityElement(n2));
  }
  public static int majorityElement(int[] nums) {
    Map<Integer, Long> collect = Arrays.stream(nums).mapToObj(Integer::new).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }
    return 0;
  }
}
