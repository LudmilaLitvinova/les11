package ua.hillellit.lms.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMethods {

  public int countOccurrence(List<String> ls, String st) {
    int count = 0;
    for (String str : ls) {
      if (st.equals(str)) {
        count++;
      }
    }
    return count;
  }

  public List<Integer> toList(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
    }
    return list;
  }

  public Set<Integer> findUnique(List<Integer> list) {
    Set<Integer> set = new HashSet<>();
    for (Integer number : list) {
      set.add(number);
    }
    return set;
  }

  public Map<String, Integer> calcOccurrence(List<String> list) {
    Set<String> set = new HashSet<>();
    for (String word : list) {
      set.add(word);
    }
    Map<String, Integer> map = new HashMap<>();
    for (String word : set) {
      map.put(word, 0);
    }
    for (String word : list) {
      int value = map.get(word);
      map.put(word, value += 1);
    }
    return map;
  }

  public List<Occurrence> findOccurrence(List<String> list) {
    Map<String, Integer> map = calcOccurrence(list);
    List<Occurrence> listOfOccur = new ArrayList<>();
    for (Entry<String, Integer> entry : map.entrySet()) {
      listOfOccur.add(new Occurrence(entry.getKey(), entry.getValue()));
    }
    return listOfOccur;
  }
}

