package com.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

  private Node head;
  private Node tail;

  private class Node {

    // default access allows us to acces the fields by name without getters/setters
    E element;
    Node next;

    public Node(E element, Node next) {
      this.element = element;
      this.next = next;
    }

  }

  public SinglyLinkedList() {
    head = null;
    tail = null;
  }

  @Override
  public void addFirst(E element) {
    Node newNode = new Node(element, head);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      // then, set the head to the new node
      // if head is set first, then you lose the reference to the rest of the list
      head = newNode;
    }
  }

  @Override
  public void addLast(E element) {
    Node newNode = new Node (element, tail);
    if (tail == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail = newNode;
    }
    
  }

  @Override
  public E pollFirst() {

    E element;

    if (head == null) {
      element = null;
    } else {

      element = head.element;

      if (head == tail) {
        head = null;
        tail = null;
      } else {
        Node next = head.next;
        head.next = null; // explicitly set the first element to null and garbage collect it
                          // Optional, but good practice
        head = next;
      }

    }
    return element;
  }

  @Override
  public E pollLast() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollLast'");
  }

  @Override
  public E peekFirst() {
    return head.element;
  }

  @Override
  public E peekLast() {
    return tail.element;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public boolean contains(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    StringJoiner joiner = new StringJoiner(", ");
    Node current = head;
    if (current != null) {
      while (current != null) {
        joiner.add(current.element.toString());
        current = current.next;
      }
    }
    sb.append(joiner);
    sb.append("]");

    return sb.toString();
  }

}
