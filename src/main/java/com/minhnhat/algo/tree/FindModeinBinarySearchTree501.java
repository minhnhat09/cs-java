package com.minhnhat.algo.tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindModeinBinarySearchTree501 {

  public static void main(String[] args) {
    TreeNode node = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    node.setLeft(node1);
    System.out.println(FindModeinBinarySearchTree501.findMode(node));
  }

  public static Map<Integer, Integer> countNode(TreeNode root, Map<Integer, Integer> map) {
    if (root != null) {
      if (map.get(root.getVal()) != null) {
        map.put(root.getVal(), map.get(root.getVal()) + 1);
      } else {
        map.put(root.getVal(), 1);
      }
      if (root.getLeft() != null) {
        countNode(root.getLeft(), map);
      }
      if (root.getRight() != null) {
        countNode(root.getRight(), map);
      }
    }
    return map;
  }

  public static int[] findMode(TreeNode root) {
    Map<Integer, Integer> map = new HashMap<>();
    map = countNode(root, map);
    if (map.isEmpty()) return new int[0];
    Integer max = map.values().stream().max(Comparator.naturalOrder()).get();
    return map.entrySet().stream()
        .filter(e -> e.getValue() == max)
        .map(Map.Entry::getKey)
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
