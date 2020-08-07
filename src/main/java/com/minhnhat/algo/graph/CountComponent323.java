package com.minhnhat.algo.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CountComponent323 {
  public static class Edge {
    int first;
    int second;
  }

  public static int countComponent(List<Edge> edges, int n) {
    Map<Integer, Boolean> visited = new HashMap<>();
    Map<Integer, List<Integer>> adjList = new HashMap<>();
    Stack<Integer> dfs;

    int count = 0;
    int ans = 0;

    for (Edge e : edges) {
      int from = e.first;
      int to = e.second;
    }
    return 0;
  }
}
