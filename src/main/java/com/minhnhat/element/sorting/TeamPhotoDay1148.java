package com.minhnhat.element.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamPhotoDay1148 {}

class Player implements Comparable<Player> {
  public Integer height;

  public Player(Integer height) {
    this.height = height;
  }

  @Override
  public int compareTo(Player player) {
    return Integer.compare(height, player.height);
  }
}

class Team {
  private List<Player> players;

  public Team(List<Integer> height) {
    players = new ArrayList<>(height.size());
    for (int i = 0; i < height.size(); i++) {
      players.add(new Player(height.get(i)));
    }
  }

  public static boolean validPlacement(Team A, Team B) {
    List<Player> aSorted = A.sortPlayersByHeight();
    List<Player> bSorted = B.sortPlayersByHeight();
    for (int i = 0; i < aSorted.size() && i < bSorted.size(); i++) {
      if (aSorted.get(i).compareTo(bSorted.get(i)) >= 0) {
        return false;
      }
    }
    return true;
  }

  public List<Player> sortPlayersByHeight() {
    List<Player> sortedPlayers = new ArrayList<>(players);
    Collections.sort(sortedPlayers);
    return sortedPlayers;
  }
}
