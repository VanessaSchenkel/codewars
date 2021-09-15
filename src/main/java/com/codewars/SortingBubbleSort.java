package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Consider the following version of Bubble Sort:
//
//        for (int i = 0; i < n; i++) {
//
//        for (int j = 0; j < n - 1; j++) {
//        // Swap adjacent elements if they are in decreasing order
//        if (a[j] > a[j + 1]) {
//        swap(a[j], a[j + 1]);
//        }
//        }
//
//        }
//        Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
//
//        Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
//        First Element: firstElement, where  is the first element in the sorted array.
//        Last Element: lastElement, where  is the last element in the sorted array.


@Component
public class SortingBubbleSort {
    static List<String> countSwaps(int[] a) {
        List<String> phrases = new ArrayList<>();

        int swaps = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int biggest = a[j];
                    int smallest = a[j + 1];
                    a[j] = smallest;
                    a[j + 1] = biggest;
                    swaps++;
                }
            }

        }
//        System.out.println("Array is sorted in "+swaps+" swaps.");
//        System.out.println("First Element: "+a[0]);
//        System.out.println("Last Element: "+a[a.length-1]);

        phrases.add("Array is sorted in " + swaps + " swaps");
        phrases.add("First Element: " + a[0]);
        phrases.add("Last Element: " + a[a.length - 1]);

        return phrases;
    }
}
