package com.sandbox.collections;

import java.util.*;

public class CollectionsDemo {

  public static void main(String[] args) {

    Set<String> set = new LinkedHashSet<>();    // LinkedHashSet maintains order 
    Set<String> set2 = new HashSet<>();         // HashSet does not maintain order
    Set<String> set3 = new TreeSet<>();         // TreeSet sorts elements; Implements SortedSet

    List<String> list = new ArrayList<>();

    Queue<String> queue = new LinkedList<>();
    Deque<String> deque = new LinkedList<>();
    
    set2.add("Hi");
    set2.add("Howdy");
    set2.add("Hi");
    set2.add("Hello");
    set2.add("Hi");
    set2.add("Hola");
    set2.add("There");

    // Sets are collections of unique elements
    // Duplicates are not allowed
    System.out.println("set2: " + set2);

    set.add("Hi");
    set.add("Howdy");
    set.add("Hi");
    set.add("Hello");
    set.add("Hi");
    set.add("Hola");
    set.add("There");

    System.out.println("set: " + set);

    set3.add("Hi");
    set3.add("Howdy");
    set3.add("Hi");
    set3.add("Hello");
    set3.add("Hi");
    set3.add("Hola");
    set3.add("There");

    System.out.println("set3: " + set3);

  }

}

