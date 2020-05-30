package com.minhnhat.java8.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Team {

  String city;
  String department;

  public Team(String city, String department) {
    this.city = city;
    this.department = department;
  }

  public static void main(String[] args) {
    /*Map<Team, String> leaders = new HashMap<>();
    leaders.put(new Team("New York", "development"), "Anne");
    leaders.put(new Team("Boston", "development"), "Brian");
    leaders.put(new Team("Boston", "marketing"), "Charlie");

    Team myTeam = new Team("New York", "development");
    String myTeamLeader = leaders.get(myTeam);
    System.out.println(myTeamLeader);*/
    String test = "test";
    System.out.println(test);
    test = "test1";
    System.out.println(test);
  }
}
