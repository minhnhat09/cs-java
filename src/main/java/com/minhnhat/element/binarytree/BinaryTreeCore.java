package com.minhnhat.element.binarytree;

public class BinaryTreeCore {
  // Depth first search
  public static void inOrderTraversal(BinaryTreeNode<Integer> root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.println(root.data);
      inOrderTraversal(root.right);
    }
  }

  public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
    if (root != null) {
      System.out.println(root.data);
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }
  }

  public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
    if (root != null) {
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.println(root.data);
    }
  }
}
