package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves
// the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities,
// Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times
// then determine the value of the element at a given position.
//Example
//        a = [3, 4, 5]
//        k = 2
//        queries = [1,2]
//        Here  is the number of rotations on a, and queries holds the list of indices to report. First we perform the two rotations:
//        [3, 4, 5] ->  [5, 3, 4] -> [4, 5, 3]
//        Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.
//        a[1] = 5
//        a[2] = 3
//
//int a[n]: the array to rotate
//        int k: the rotation count
//        int queries[1]: the indices to report
//        Returns
//
//        int[q]: the values in the rotated  as requested in

@Component
public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int [] answer = new int[queries.length];

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.rotate(list, k);

        for (int i = 0; i < queries.length; i++) {
            answer[i] = list.get(queries[i]);
        }

        return answer;
    }
}
