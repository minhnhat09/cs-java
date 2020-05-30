package com.minhnhat.algo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsinBinaryTree993 {
  public static int getDepth(TreeNode node, int num) {
    int depth = 0;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(node);
    q.add(new TreeNode(Integer.MAX_VALUE));
    while (!q.isEmpty()) {
      TreeNode n = q.poll();
      if (n.val == num) {
        return depth;
      }
      if (n.val == Integer.MAX_VALUE) {
        depth++;
        q.add(new TreeNode(Integer.MAX_VALUE));
      } else {
        if (n.left != null) {
          q.add(n.left);
        }
        if (n.right != null) {
          q.add(n.right);
        }
      }
    }
    return -1;
  }

  public static boolean sameParent(TreeNode node, int x, int y) {
    if (node.right != null && node.left != null) {
      if ((node.left.val == x && node.right.val == y)
          || node.left.val == y && node.right.val == x) {
        return true;
      }
      return sameParent(node.right, x, y) || sameParent(node.left, x, y);
    }
    return false;
  }

  public boolean isCousins(TreeNode root, int x, int y) {
    if (sameParent(root, x, y)) {
      return false;
    }
    return getDepth(root, x) == getDepth(root, y);
  }
}
