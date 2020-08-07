package com.minhnhat.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST530 {
  public int getMinimumDifference(TreeNode root) {
    return minPairValueInList(TreeNode.treeToList(root));
  }

  public static int minPairValueInList(List<Integer> l) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < l.size(); i++) {
      for (int j = i + 1; j < l.size(); j++) {
        int val = Math.abs(l.get(i) - l.get(j));
        if (val < min) {
          min = val;
        }
      }
    }
    return min;
  }
}
