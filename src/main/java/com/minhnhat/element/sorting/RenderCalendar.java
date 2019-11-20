package com.minhnhat.element.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RenderCalendar {
  public static class Event {
    public int start, finish;

    public Event(int start, int finish) {
      this.start = start;
      this.finish = finish;
    }
  }

  private static class Endpoint implements Comparable<Endpoint> {
    public int time;
    public boolean isStart;

    @Override
    public int compareTo(Endpoint that) {
      if (time != that.time) {
        return Integer.compare(time, that.time);
      }

      return isStart && !that.isStart ? -1 : !isStart && that.isStart ? 1 : 0;
    }

    public Endpoint(int time, boolean isStart) {
      this.time = time;
      this.isStart = isStart;
    }
  }

  public static int findMaxSimultaneousEvents(List<Event> A) {
    List<Endpoint> E = new ArrayList<>();
    for (Event event : A) {
      E.add(new Endpoint(event.start, true));
      E.add(new Endpoint(event.finish, false));
    }
    Collections.sort(E);
    int maxNumSimultaneousEvents = 0, numsSimultaneousEvents = 0;
    for (Endpoint endpoint : E) {
      if (endpoint.isStart) {
        ++numsSimultaneousEvents;
        maxNumSimultaneousEvents = Math.max(numsSimultaneousEvents, maxNumSimultaneousEvents);
      } else {
        --numsSimultaneousEvents;
      }
    }
    return maxNumSimultaneousEvents;
  }
}