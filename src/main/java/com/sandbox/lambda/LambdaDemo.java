package com.sandbox.lambda;

import java.util.function.*;
import java.util.List;
import java.util.Arrays;

public class LambdaDemo {   // Lambda's are anonymous functions

  //x -> x * x; // Lambda expression that squares a number
                // Doesn't have a name, which means its anonymous
                // The return type is inferred from the context

  public static void main(String[] args) {
    Predicate<String> predicate = x -> x.startsWith("a");

    // Takes 1 value and returns a value
    Function<Integer, Integer> square = x -> {
      x = x + 5;
      return x * 2;
    };

    // Takes no arguments and returns a value
    Supplier<String> supplier = () -> "Hello World!";

    // Takes 1 value returns no value
    Consumer<String> consumer = x -> System.out.println(x);
    Consumer<String> consumerReferece = System.out::println; // Method reference

    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
      .stream()
      .sorted()
      .filter(x -> x.startsWith("c"))
      .map(String::toUpperCase)
      .forEach(System.out::println);
  }

}
