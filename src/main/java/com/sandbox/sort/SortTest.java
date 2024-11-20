package com.sandbox.sort;

import java.util.Arrays;

public class SortTest {

<<<<<<< HEAD
    public static void main(String[] args) {

        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.selectionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
=======
  public static void main(String[] args) {
    Integer[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

    SortingUtility.selectionSort(data);

    Arrays.stream(data).forEach(System.out::println);

    Integer[] data2 = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

    SortingUtility.insertionSort(data2);

    Arrays.stream(data2).forEach(System.out::println);

    Integer[] data3 = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

    SortingUtility.bubbleSort(data3);

    Arrays.stream(data3).forEach(System.out::println);

    Integer[] data4 = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

    SortingUtility.quickSort(data4);

    Arrays.stream(data4).forEach(System.out::println);

    Integer[] data5 = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

    SortingUtility.mergeSort(data5);

    Arrays.stream(data5).forEach(System.out::println);
  }
>>>>>>> 9f6c683 (Sorting activity)
}
