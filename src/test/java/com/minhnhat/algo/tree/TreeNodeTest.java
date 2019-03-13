package com.minhnhat.algo.tree;

import org.junit.Test;
import static org.junit.Assert.*;


public class TreeNodeTest {

  @Test
  public void canInsertInTree(){
    TreeNode node = new TreeNode(5);
    node.insertBinary(10);
    node.insertBinary(3);
    node.insertBinary(15);
    assertEquals(node.getVal(),5);
    assertEquals(node.getLeft().getVal(), 3);
    assertEquals(node.getRight().getVal(), 10);
    assertEquals(node.getRight().getRight().getVal(), 15);
  }

  @Test(expected = NullPointerException.class)
  public void expectedNullForNonInsertedValue(){
    TreeNode node = new TreeNode(5);
    node.insertBinary(10);
    fail(String.valueOf(node.getLeft().getVal()));
  }

  @Test
  public void containReturnNodeWithTheSameData(){
    TreeNode node = new TreeNode(5);
    node.insertBinary(3);
    node.insertBinary(7);
    node.insertBinary(9);
    assertEquals(node.getLeft(), node.contain(3));
  }

  @Test
  public void containReturnNullIfValueNotFound(){
    TreeNode node = new TreeNode(5);
    node.insertBinary(3);
    assertEquals(null, node.contain(9));
  }


}
