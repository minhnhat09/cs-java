package com.minhnhat.algo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreasingOrderSearchTree897 {

  public static void insertBinaryStatic(TreeNode root, int data) {
    if (data < root.val && root.left != null) {
      insertBinaryStatic(root.left, data);
    } else if (data < root.val) {
      root.left = new TreeNode(data);
    } else if (data > root.val && root.right != null) {
      insertBinaryStatic(root.right, data);
    } else if (data > root.val) {
      root.right = new TreeNode(data);
    }
  }

  public static List<Integer> treeToList(TreeNode node) {
    List<Integer> l = new ArrayList<>();
    if (node != null) {
      l.add(node.val);
      if (node.left != null) {
        l.addAll(treeToList(node.left));
      }
      if (node.right != null) {
        l.addAll(treeToList(node.right));
      }
    }
    return l;
  }
  public TreeNode increasingBST(TreeNode root) {
    List<Integer> list = treeToList(root);
    System.out.println(list);
    Collections.sort(list);
    if (list.size() > 0) {
      TreeNode node = new TreeNode(list.get(0));
      for (int i = 1; i < list.size(); i++) {
        insertBinaryStatic(node, list.get(i));
      }
return node;
    }
    System.out.println(list);

    return null;
  }

}
