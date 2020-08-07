package com.minhnhat.algo.hash;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet705 {
  public static void main(String[] args) {
    MyHashSet myHashSet = new MyHashSet();
    myHashSet.add(1);
    System.out.println(myHashSet.contains(1));
    myHashSet.add(2);
    System.out.println(myHashSet.toString());
    myHashSet.remove(2);
    System.out.println(myHashSet.toString());
  }
}

class MyHashSet {
  public List<Integer> nodes;

  /** Initialize your data structure here. */
  public MyHashSet() {
    this.nodes = new ArrayList<>();
  }

  public void add(int key) {
    if (!this.contains(key)) {
      this.nodes.add(key);
    }
  }

  public void remove(int key) {
    if (this.nodes.indexOf(key) != -1) {
      this.nodes.remove(this.nodes.indexOf(key));
    }
  }

  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    return this.nodes.contains(key);
  }

  @Override
  public String toString() {
    return "MyHashSet{" + "nodes=" + nodes + '}';
  }
}
