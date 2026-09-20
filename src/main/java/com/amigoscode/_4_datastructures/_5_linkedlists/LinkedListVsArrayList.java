package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= 9999; i++) {
            arrayList.add(i);

        }
        for (int i = 0; i < 9999; i++) {
            linkedList.add(i);
        }

        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        long arrayListStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            arrayList.add(0, index);
        }

        long arrayListEndTime = System.nanoTime();
        long linkedListStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            linkedList.add(0, index);
        }

        long linkedListEndTime = System.nanoTime();

        double arrayListTimeMilliseconds =
                (arrayListEndTime - arrayListStartTime) / 1_000_000.0;

        double linkedListTimeMilliseconds =
                (linkedListEndTime - linkedListStartTime) / 1_000_000.0;

        System.out.println("ArrayList add at beginning: " + arrayListTimeMilliseconds + " ms");
        System.out.println("LinkedList add at beginning: " + linkedListTimeMilliseconds + " ms");

        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        long arrayListAddEndStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            arrayList.add(index);
        }

        long arrayListAddEndEndTime = System.nanoTime();

        long linkedListAddEndStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            linkedList.add(index);
        }

        long linkedListAddEndEndTime = System.nanoTime();

        double arrayListAddEndTimeMilliseconds =
                (arrayListAddEndEndTime - arrayListAddEndStartTime) / 1_000_000.0;

        double linkedListAddEndTimeMilliseconds =
                (linkedListAddEndEndTime - linkedListAddEndStartTime) / 1_000_000.0;

        System.out.println("ArrayList add at end: " + arrayListAddEndTimeMilliseconds + " ms");
        System.out.println("LinkedList add at end: " + linkedListAddEndTimeMilliseconds + " ms");

        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        long arrayListGetMiddleStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            arrayList.get(arrayList.size() / 2);
        }

        long arrayListGetMiddleEndTime = System.nanoTime();

        long linkedListGetMiddleStartTime = System.nanoTime();

        for (int index = 0; index < 1000; index++) {
            linkedList.get(linkedList.size() / 2);
        }

        long linkedListGetMiddleEndTime = System.nanoTime();

        double arrayListGetMiddleTimeMilliseconds =
                (arrayListGetMiddleEndTime - arrayListGetMiddleStartTime) / 1_000_000.0;

        double linkedListGetMiddleTimeMilliseconds =
                (linkedListGetMiddleEndTime - linkedListGetMiddleStartTime) / 1_000_000.0;

        System.out.println("ArrayList get middle: " + arrayListGetMiddleTimeMilliseconds + " ms");
        System.out.println("LinkedList get middle: " + linkedListGetMiddleTimeMilliseconds + " ms");

        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println();
        System.out.println("Summary:");
        System.out.println("LinkedList is faster for insertions at the beginning because it only changes links between nodes.");
        System.out.println("ArrayList is faster for random access because it can access elements directly by index.");
        System.out.println("Use ArrayList for general-purpose lists and frequent reads by index.");
        System.out.println("Use LinkedList when you frequently add or remove elements at the beginning or end.");
    }
}
