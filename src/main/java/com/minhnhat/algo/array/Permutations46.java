package com.minhnhat.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations46 {
  public static void dfs(List<List<Integer>> result, List<Integer> temp, List<Integer> elements) {
    System.out.println(temp);
    if (elements.size() == 0) {
      result.add(temp);
    }

    for (int i = 0; i < elements.size(); i++) {
      temp.add(elements.get(i));
      List<Integer> nextElements = new ArrayList<>();
      nextElements.addAll(elements);
      nextElements.remove(i);
      elements.remove(elements.size() - 1);
      dfs(result, temp, nextElements);
      temp.remove(temp.size()-1);
    }
  }

  public static void main(String[] args) {
    System.out.println(permute(new int[]{1,2,3}));
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    List<Integer> intList = new ArrayList<>();
    for (int i : nums)
    {
      intList.add(i);
    }
    dfs(result, new ArrayList<>(), intList);
    return  result;
  }
}
