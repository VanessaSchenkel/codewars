package com.codewars;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

//Given an array of integers, find the sum of its elements.
//Sample Input
//6
//1 2 3 4 10 11
//Sample Output
//31

@Component
public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        return IntStream.of(ar).sum();
    }
}
