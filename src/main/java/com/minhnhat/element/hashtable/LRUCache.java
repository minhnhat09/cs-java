package com.minhnhat.element.hashtable;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
  LinkedHashMap<Integer, Integer> isbnToPrice;

  LRUCache(final int capacity) {
    this.isbnToPrice =
        new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
          /** */
          private static final long serialVersionUID = 1L;

          @Override
          protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
            return this.size() > capacity;
          }
        };
  }

  public Integer lookup(Integer key) {
    if (!isbnToPrice.containsKey(key)) {
      return null;
    }
    return isbnToPrice.get(key);
  }

  public Integer insert(Integer key, Integer value) {
    Integer currentValue = isbnToPrice.get(key);
    if (!isbnToPrice.containsKey(key)) {
      isbnToPrice.put(key, value);
      return currentValue;
    } else {
      return null;
    }
  }

  public Integer erase(Object key) {
    return isbnToPrice.remove(key);
  }
}
