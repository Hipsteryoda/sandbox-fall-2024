package com.sandbox.stacks;

import java.util.ArrayList;

public class ArrayListStack<T> implements Stack<T> {

  private ArrayList<T> stack;

  public ArrayListStack() {
    this.stack = new ArrayList<T>();
  }

  // implement methods from Stack interface
  public boolean empty() {
    return this.stack.isEmpty();
  }

  public T peek() {
    return this.stack.getLast();
  }

  public T pop() {
    return this.stack.removeLast();
  }

  public void push(T item) {
    this.stack.addLast(item);
  }

  public int search(T e) {
    return this.stack.lastIndexOf(e);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ArrayListStack {");
    sb.append(" stack=");
    sb.append(stack);
    sb.append(" }");
    return sb.toString();
  }

  public static void main(String[] args) {
    ArrayListStack<String> stack = new ArrayListStack<String>();
    stack.push("one");
    stack.push("two");
    stack.push("three");
    System.out.println("stack: " + stack);
    System.out.println("peek: " + stack.peek());
      
    System.out.println("pop: " + stack.pop());
    System.out.println("stack: " + stack);
    System.out.println("search for 'two': " + stack.search("two"));

  }

}
