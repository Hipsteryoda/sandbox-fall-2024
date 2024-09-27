package com.sandbox.collections;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

  public static void main(String[] args) {
    
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four");
    map.put(5, "Five");
    map.put(6, "Six");
    map.put(7, "Seven");
    map.put(8, "Eight");
    map.put(9, "Nine");
    map.put(10, "Ten");

    System.out.println("Map: " + map);

    Map<Integer, Map<Integer, String>> mapOfMaps = new HashMap<>();

  }
}
