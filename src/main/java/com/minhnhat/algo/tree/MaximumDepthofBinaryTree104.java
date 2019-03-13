package com.minhnhat.algo.tree;

public class MaximumDepthofBinaryTree104 {


  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.getLeft() != null && root.getRight() == null) {
      return 1+ maxDepth(root.getLeft());
    } else if (root.getRight() != null && root.getLeft() == null) {
      return 1+ maxDepth(root.getRight());
    } else if (root.getLeft() != null && root.getRight() != null) {
      return 1+ Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    } else {
      return 1;
    }
  }


}
