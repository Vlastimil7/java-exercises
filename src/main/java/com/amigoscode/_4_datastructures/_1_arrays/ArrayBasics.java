package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Array Basics
// Learn how to create, manipulate, and search through arrays in Java.

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // TODO: 1 - Create an int array of size 5
        int[] number = new int[5];

        // TODO: 2 - Fill the array with values 10, 20, 30, 40, 50 using a for loop
        //           (hint: use i * 10 + 10 or similar pattern)
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 10 + 10;
        }

        // TODO: 3 - Print all elements of the array using Arrays.toString()
        System.out.println(Arrays.toString(number));

        // TODO: 4 - Find the maximum value in the array
        //           Iterate through the array and track the largest value found
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);


        // TODO: 5 - Find the minimum value in the array
        //           Iterate through the array and track the smallest value found
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println(min);

        // TODO: 6 - Sort the array using Arrays.sort()
        //           Then print the sorted array
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));


        // TODO: 7 - Use Arrays.binarySearch() to find the index of value 30
        //           Note: the array must be sorted before using binarySearch
        //           Print the index where the value was found
        int index = Arrays.binarySearch(number, 30);
        System.out.println(index);


    }
}
