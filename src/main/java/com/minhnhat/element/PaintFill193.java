package com.minhnhat.element;

import java.nio.charset.CharsetEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PaintFill193 {

  private static void markBoudaryRegion(int i, int j, List<List<CharsetEncoder>> board, List<List<Boolean>> visited) {
    Queue<Coordinate> q = new LinkedList<>();
    q.add(new Coordinate(i, j));
    visited.get(i).set(j, true);
    while (!q.isEmpty()) {
      Coordinate coordinate = q.poll();
    }
  }

  private static class Coordinate {
    public Integer x;
    public Integer y;

    public Coordinate(Integer x, Integer y) {
      this.x = x;
      this.y = y;
    }
  }
}
