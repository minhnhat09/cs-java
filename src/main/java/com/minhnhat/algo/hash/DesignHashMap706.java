package com.minhnhat.algo.hash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesignHashMap706 {
  public static void main(String[] args) {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    hashMap.get(1); // returns 1
    hashMap.get(3); // returns -1 (not found)
    hashMap.put(2, 1); // update the existing value
    hashMap.get(2); // returns 1
    hashMap.remove(2); // remove the mapping for 2
    hashMap.get(2);
  }
}

class MyHashMap {
  /** Initialize your data structure here. */
  public List<Node> nodes;

  public MyHashMap() {
    this.nodes = new ArrayList<>();
  }

  /** value will always be non-negative. */
  public void put(int key, int value) {
    for (Node n : this.nodes) {
      if (n.key == key) {
        n.value = value;
        return;
      }
    }
    Node n = new Node(key, value);
    this.nodes.add(n);
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
   * for the key
   */
  public int get(int key) {
    for (Node n : this.nodes) {
      if (n.key == key) {
        return n.value;
      }
    }
    return -1;
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    Iterator<Node> nodeIterator = this.nodes.iterator();
    while (nodeIterator.hasNext()) {
      Node n = nodeIterator.next();
      if (n.key == key) {
        nodeIterator.remove();
      }
    }
  }

  class Node {
    public int key;
    public int value;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }
}
