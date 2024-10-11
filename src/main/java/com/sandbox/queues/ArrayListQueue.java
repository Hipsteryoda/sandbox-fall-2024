package com.sandbox.queues;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * ArrayListQueue
 */
public class ArrayListQueue<T> implements Queue<T> {

  protected List<T> queue;
  
  public ArrayListQueue(List<T> queue) {
    this.queue = queue;
  }

	@Override
	public boolean offer(T e) {
    this.queue.add(e);
    return true;
	}

	@Override
	public T poll() {
    T returnValue = null;
    try {
      returnValue = this.queue.removeLast();
    } catch (NoSuchElementException e) {
      returnValue = null;
    }
    return returnValue;
	}

	@Override
	public T peek() {
    return this.queue.getLast();
	}

	@Override
	public boolean isEmpty() {
    return this.queue.isEmpty();
	}

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ArrayListQueue: {");
    sb.append("queue: [");
    for (T t : queue) {
      sb.append(t.toString());
      sb.append(", ");
    }
    sb.append("]");
    sb.append("}");
    return sb.toString();
  }

  
}
