package com.minhnhat.algo.tree;

import java.util.*;

public class TreeNode {
  TreeNode left;
  TreeNode right;
  int val;

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode() {}

  public static void dfs(TreeNode treeNode) {
    Stack<TreeNode> stackTreeNode = new Stack<>();
    stackTreeNode.push(treeNode);

    while (!stackTreeNode.isEmpty()) {
      TreeNode node = stackTreeNode.pop();
      if (node.getRight() != null) {
        stackTreeNode.push(node.getRight());
      }
      if (node.getLeft() != null) {
        stackTreeNode.push(node.getLeft());
      }
      System.out.println(node.getVal());
    }
  }

  public static void bfs(TreeNode treeNode) {
    Queue<TreeNode> queueTreeNode = new LinkedList<>();
    queueTreeNode.add(treeNode);

    while (!queueTreeNode.isEmpty()) {
      TreeNode node = queueTreeNode.poll();
      if (node.getRight() != null) {
        queueTreeNode.add(node.getRight());
      }
      if (node.getLeft() != null) {
        queueTreeNode.add(node.getLeft());
      }
      System.out.println(node.getVal());
    }
  }

  public static void insertNormal(TreeNode root, int data) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.getLeft() == null) {
        TreeNode newNode = new TreeNode(data);
        node.setLeft(newNode);
      } else if (node.getRight() == null) {
        TreeNode newNode = new TreeNode(data);
        node.setRight(newNode);
      } else {
        if (node.getLeft() != null) {
          queue.add(node.getLeft());
        }
        if (node.getRight() != null) {
          queue.add(node.getRight());
        }
      }
    }
  }

  public static List<Double> averageLevelTree(TreeNode root) {

    Queue<TreeNode> queueTreeNode = new LinkedList<>();
    Queue<String> temp = new LinkedList<>();
    queueTreeNode.add(root);
    temp.add(String.valueOf(root.getVal()));
    temp.add(";");
    while (!queueTreeNode.isEmpty()) {
      TreeNode node = queueTreeNode.poll();
      if (node.getRight() != null) {
        queueTreeNode.add(node.getRight());
        temp.add(String.valueOf(node.getRight().getVal()));
      }
      if (node.getLeft() != null) {
        queueTreeNode.add(node.getLeft());
        temp.add(String.valueOf(node.getLeft().getVal()));
      }
      if (node.getLeft() != null || node.getRight() != null) {
        temp.add(";");
      }
    }
    double total = 0;
    double member = 0;
    List<Double> result = new ArrayList<>();
    for (String e : temp) {
      if (e != ";") {
        total += Integer.valueOf(e);
        member++;
      } else {
        result.add(total / member);
        total = 0;
        member = 0;
      }
    }

    return result;
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

  public static void main(String[] args) {
    TreeNode node = new TreeNode(5);
    node.insertBinary(4);
    node.insertBinary(3);
    node.insertBinary(7);
    node.insertBinary(8);
    System.out.println(treeToList(node));
    System.out.println(treeToList(InvertBinaryTree226.invertTree(node)));
  }

  public void insertBinary(int data) {
    if (data < this.val && this.left != null) {
      this.left.insertBinary(data);
    } else if (data < this.val) {
      this.left = new TreeNode(data);
    } else if (data > this.val && this.right != null) {
      this.right.insertBinary(data);
    } else if (data > this.val) {
      this.right = new TreeNode(data);
    }
  }

  public TreeNode contain(int data) {
    if (data == this.val) {
      return this;
    } else if (data < this.val && this.left != null) {
      return this.left.contain(data);
    } else if (data > this.val && this.right != null) {
      return this.right.contain(data);
    }
    return null;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }
}
