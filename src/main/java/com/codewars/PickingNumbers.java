package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
//Example
//       a = [1, 1, 2, 2, 4, 4, 5, 5, 5]
//        There are two subarrays meeting the criterion: [1, 1, 2, 2] and [4, 4, 5, 5, 5]. The maximum length subarray has 5 elements.
@Component
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {

        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int numberToCompare = a.get(i);
            int counter = 0;

            for (int j = 0; j < a.size(); j++) {
                if (numberToCompare == a.get(j) || (numberToCompare - a.get(j)) == 1) {
                    counter++;
                }
                if (counter > max) {
                    max = counter;
                }
            }
        }
        return max;
    }
}
