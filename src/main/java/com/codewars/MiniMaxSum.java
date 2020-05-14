package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;

//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the
//five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//Function Description
//Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the
//minimum sum and the maximum sum of 4 of 5 elements.
//Output Format
//Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by
//summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
//    Sample Input
//    1 2 3 4 5
//    Sample Output
//    10 14

@Component
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        Integer min = Arrays.stream(arr).min().getAsInt();
        Integer max = Arrays.stream(arr).max().getAsInt();
        long sumMax = 0;
        long sumMin = 0;

        if (!min.equals(max)) {
            for (int value : arr) {
                if (value != max) {
                    sumMin += value;
                }
                if (value != min) {
                    sumMax += value;
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                sumMax += arr[i];
                sumMin += arr[i];
            }
        }

        System.out.println(sumMin + " " + sumMax);
    }
}
