package com.sandbox.streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamExamples {

  public static void main(String[] args) {

    //test data
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
    List<String> names = Arrays.asList("John", "Bob", "Lauren", "Jill", "Shannon", "Jack");
    // IntPredicate is a specialization of Predicate<Integer>
    IntPredicate evenOnly = x -> x % 2 == 0;
    // Predicate is a functional interface
    Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;


    // intermediate operations
    // map
    List<Integer> squares = numbers
      .stream()
      .map(x -> x * x) // monad <- mathematical concept
      .collect(Collectors.toList());
    squares.forEach(System.out::println); // method reference

    // filter
    List<String> result = names
      .stream()
      .filter(name -> name.toLowerCase().startsWith("j"))
      .collect(Collectors.toList());
    result.forEach(System.out::println);

    // sorted
    List<String> sortedNames = names
      .stream()
      .sorted()
      .collect(Collectors.toList());
    sortedNames.forEach(System.out::println);
    
    // reverse sorted
    List<String> reverseSortedNames = names
      .stream()
      .sorted((s1, s2) -> s2.compareTo(s1)) // because s2.compareTo(s1), it will be sorted in reverse order
      .collect(Collectors.toList());
    reverseSortedNames.forEach(System.out::println);

    // collect
    LinkedHashSet<Integer> linkedHashSet = numbers
      .stream()
      .map(x -> x * x)
      .collect(Collectors.toCollection(LinkedHashSet::new));
    linkedHashSet.forEach(System.out::println);


    // accumulate
    int evenSum = numbers
      .stream()
      .filter(evenOnlyPredicate)
      .reduce(0, (acc, y) -> acc + y);
    System.out.println("Even sum: " + evenSum);

    int totalSum = IntStream.iterate(0, x -> x + 1)
      .skip(5)
      .limit(5)
      .filter(evenOnly)
      .reduce(2, Integer::sum);
    System.out.println("Total sum: " + totalSum);

    // random Ints
    Random random = new Random();
    random.ints(1, 11)
      .limit(50)
      .forEach(System.out::println);

    // IntStream generate
    // "Atomic" means it is safe to use in a multi-threaded environment
    // It is completely processed the process and is not handed off to another thread mid process
    final AtomicInteger counter = new AtomicInteger(1);
    IntStream.generate(counter::getAndIncrement)
      .filter(evenOnly)
      .limit(10)
      .forEach(System.out::println);

    // stream of random strings
    // Limited to 16 characters
    String randomString = Stream.generate(new StringGenerator())
      .limit(16)
      .collect(Collectors.joining());
    System.out.println(randomString);

  }
}
