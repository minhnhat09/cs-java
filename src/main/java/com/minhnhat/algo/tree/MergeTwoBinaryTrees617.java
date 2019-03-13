package com.minhnhat.algo.tree;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MergeTwoBinaryTrees617 {


  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 != null && t2 == null) {
      return t1;
    }
    if (t1 == null && t2 != null) {
      return t2;
    }
    if (t1 == null && t2 == null) {
      return null;
    }
    TreeNode sumTree = new TreeNode(t1.getVal() + t2.getVal());
    if (t1.getLeft() == null && t2.getLeft() != null) {
      sumTree.setLeft(t2.getLeft());
    }
    if (t1.getLeft() != null && t2.getLeft() == null) {
      sumTree.setLeft(t1.getLeft());
    }
    if (t1.getLeft() != null && t2.getLeft() != null) {
      sumTree.setLeft(mergeTrees(t1.getLeft(), t2.getLeft()));
    }
    if (t1.getRight() == null && t2.getRight() != null) {
      sumTree.setRight(t2.getRight());
    }
    if (t1.getRight() != null && t2.getRight() == null) {
      sumTree.setRight(t1.getRight());
    }
    if (t1.getRight() != null && t2.getRight() != null) {
      sumTree.setRight(mergeTrees(t1.getRight(), t2.getRight()));
    }
    return sumTree;
  }
}
