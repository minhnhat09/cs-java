package com.minhnhat.element.binarytree;

public class LCAWithParentPointer {
  public int getDepth(BinaryTree<Integer> node) {
    int depth = 0;
    if (node.parent != null) {
      node = node.parent;
      depth++;
    }
    return depth;
  }
}
