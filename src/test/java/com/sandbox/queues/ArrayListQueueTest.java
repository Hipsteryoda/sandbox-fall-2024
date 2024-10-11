package com.sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ArrayListQueueTest {
  
    private ArrayListQueue<Integer> queue;
  
    @BeforeEach
    public void setUp() {
      queue = new ArrayListQueue<>(new ArrayList<>());
    }
  
    @Test
    public void testOffer() {
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);

      assertEquals(3, queue.queue.size());
    }
  
    @Test
    public void testPoll() {
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
    }
  
    @Test
    public void testPeek() {
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);
      System.out.println(queue.peek());
      System.out.println(queue.peek());
      System.out.println(queue.peek());
      System.out.println(queue.peek());
    }
  
    @Test
    public void testIsEmpty() {
      System.out.println(queue.isEmpty());
      queue.offer(1);
      System.out.println(queue.isEmpty());
      queue.poll();
      System.out.println(queue.isEmpty());
    }
}

