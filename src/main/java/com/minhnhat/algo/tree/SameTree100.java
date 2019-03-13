package com.minhnhat.algo.tree;


import com.minhnhat.algo.tree.TreeNode;

public class SameTree100 {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p ==null && q==null){
      return true;
    }
    if ((p != null && q == null) || (p == null && q != null) || (p != null && q != null && p.getVal() != q.getVal())
            || (p.getLeft() != null && q.getLeft() == null) || (p.getLeft() == null && q.getLeft() != null)
            || (p.getRight() != null && q.getRight() == null) || (p.getRight() == null && q.getRight() != null)) {
      return false;
    }
    boolean left = true;
    boolean right = true;
    if (p.getLeft() != null && q.getLeft() != null) {
      left = isSameTree(p.getLeft(), q.getLeft());
    }
    if(left){
      if (p.getRight() != null && q.getRight() != null) {
        right =  isSameTree(p.getRight(), q.getRight());
      }
    }

    return right && left;
  }


}



