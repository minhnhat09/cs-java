package com.minhnhat.element.binarytree;

public class HeightBalance101 {
  public boolean balanced;
  public int height;

  public HeightBalance101(boolean balanced, int height) {
    this.balanced = balanced;
    this.height = height;
  }

  public static boolean isBalanced(BinaryTreeNode<Integer> tree) {
    return checkBalanced(tree).balanced;
  }

  private static HeightBalance101 checkBalanced(BinaryTreeNode<Integer> tree) {
    if (tree == null) {
      return new HeightBalance101(true, -1);
    }
    HeightBalance101 leftResult = checkBalanced(tree.left);
    if (!leftResult.balanced) {
      return leftResult;
    }
    HeightBalance101 rightResult = checkBalanced(tree.right);
    if (!rightResult.balanced) {
      return rightResult;
    }
    boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
    int height = Math.max(leftResult.height, rightResult.height) + 1;
    return new HeightBalance101(isBalanced, height);
  }
}
