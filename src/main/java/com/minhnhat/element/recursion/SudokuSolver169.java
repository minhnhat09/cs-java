package com.minhnhat.element.recursion;

import java.util.List;

public class SudokuSolver169 {
  private static final int EMPTY_ENTRY = 0;

  public static boolean solveSudoku(List<List<Integer>> partialAssignment) {
    return solvePartialSudoku(0, 0, partialAssignment);
  }

  private static boolean validToAddVal(List<List<Integer>> partialAssignment, int i, int j, int val) {
    for (List<Integer> element : partialAssignment) {
      if (val == element.get(j)) {
        return false;
      }
    }

    for (int k = 0; k < partialAssignment.size(); ++k) {
      if (val == partialAssignment.get(i).get(k)) {
        return false;
      }
    }

    int regionSize = (int) Math.sqrt(partialAssignment.size());
    int I = i / regionSize, J = j / regionSize;
    for (int a = 0; a < regionSize; ++a) {
      for (int b = 0; b < regionSize; ++b) {
        if (val == partialAssignment.get(regionSize * I + a).get(regionSize * J + b)) {
          return false;
        }
      }
    }
    return true;

  }

  private static boolean solvePartialSudoku(int i, int i1, List<List<Integer>> partialAssignment) {
    return true;
  }

}
