package com.minhnhat.element.binarytree;

public class SymmetricTree102 {
  private static boolean isSymmetric(BinaryTreeNode<Integer> root) {
    return root == null || checkSymmetric(root.left, root.right);
  }

  private static boolean checkSymmetric(
      BinaryTreeNode<Integer> subTree0, BinaryTreeNode<Integer> subTree1) {
    if (subTree0 == null && subTree1 == null) {
      return true;
    } else if (subTree0 != null && subTree1 != null) {
      return subTree0.data == subTree1.data
          && checkSymmetric(subTree0.left, subTree1.right)
          && checkSymmetric(subTree0.right, subTree1.left);
    }

    return false;
  }
}
