package com.sandbox.linkedlist;

public interface LinkedList<E> {

  // LinkedLists use a "linked structure" to store data
  // Each element in the list is a "node" that contains the data and a reference to the next node
  // They can be efficent because elements can be inserted or removed without shifting other elements

  void addFirst(E element);
  void addLast(E element);

  E pollFirst();
  E pollLast();

  E peekFirst();
  E peekLast();

  void clear();
  boolean contains(E element);
  int size();

}
