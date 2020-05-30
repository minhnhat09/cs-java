package com.minhnhat.algo.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KClosestPointstoOrigin973 {

  public static void main(String[] args) {
    int[][] points = {{1, 3}, {-2, 2}};
    kClosest(points, 1);
  }

  public static int[][] kClosest(int[][] points, int K) {
    Map<int[], Double> mapPoints = new LinkedHashMap<>();
    Arrays.stream(points)
        .forEach(
            p -> {
              mapPoints.put(p, Double.valueOf(Math.sqrt(Arrays.stream(p).map(e -> e * e).sum())));
              ;
            });
    List<int[]> keys =
        mapPoints.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .limit(Long.valueOf(K))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    return keys.toArray(new int[keys.size()][]);
  }
}
