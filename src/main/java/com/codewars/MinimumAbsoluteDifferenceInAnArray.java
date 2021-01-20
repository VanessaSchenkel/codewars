package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//The absolute difference is the positive difference between two values a and b, is written |a   b| or |b  a| and they are equal.
// If a=3 and b=2, |3   2| = |2   3|= 1 . Given an array of integers, find the minimum absolute difference between any two elements in the array.


@Component
public class MinimumAbsoluteDifferenceInAnArray {
    static int minimumAbsoluteDifference(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);

        if (arr.length == 1) return 0;

        int min = Math.abs(list.get(0) - list.get(1));

        for (int i = 1; i < arr.length - 1; i++) {
                if (min > Math.abs(list.get(i) - list.get(i+1))){
                    min = Math.abs(list.get(i) - list.get(i+1));
                }

        }
        return min;
    }
}
