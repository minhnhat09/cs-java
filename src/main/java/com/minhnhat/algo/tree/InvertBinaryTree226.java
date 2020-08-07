package com.minhnhat.algo.tree;

public class InvertBinaryTree226 {
  public static TreeNode invertTree(TreeNode root) {
    if (root != null) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      invertTree(root.right);
      invertTree(root.left);
    }
    return root;
  }
}
