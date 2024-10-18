package com.sandbox.linkedlist;


public class SingleDriver {
    public static void main(String[] args) {

      LinkedList<String> list = new SinglyLinkedList<>();

      list.addFirst("first");
      list.addFirst("second");
      list.addFirst("third");
      list.addFirst("fourth");
      list.addFirst("fifth");

      System.out.println(list);

      list.pollFirst();

      System.out.println(list);

      list.addFirst("sixth");

      System.out.println(list);

    }
}
