package com.codewars;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int cur = 0, max = 0;
        for (int i : arr) {
            cur = Math.max(0, cur + i);
            max = Math.max(max, cur);
        }
        return max;
    }
}
