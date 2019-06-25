package com.minhnhat.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
  public static void traverse(TreeNode root, List<Integer> r) {
    if (root != null) {
      if (root.left != null) {
        traverse(root.left, r);
      }
      r.add(root.val);
      if (root.right != null) {
        traverse(root.right, r);
      }
    }
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> r = new ArrayList<>();
    traverse(root, r);
    return r;
  }
}
