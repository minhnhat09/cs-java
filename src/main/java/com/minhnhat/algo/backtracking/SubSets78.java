package com.minhnhat.algo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubSets78 {
  public static List<List<Integer>> powerSets = new ArrayList<>();
  public static List<Integer> subSets = new ArrayList<>();

  public static void backtrack(List<Integer> nums, int start) {
    powerSets.add(new ArrayList<>(subSets));
    for (int i = start; i < nums.size(); i++) {
      subSets.add(nums.get(i));
      backtrack(nums, i + 1);
      subSets.remove(nums.get(i));
    }
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    backtrack(integers, 0);
    return powerSets;
  }

  public static void printArray(List<List<Integer>> sets) {
    for (List<Integer> integers : sets) {
      System.out.println(integers);
    }
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    printArray(subsets(nums));
  }
}
