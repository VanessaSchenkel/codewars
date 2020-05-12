package com.codewars;

import org.springframework.stereotype.Component;

import java.util.stream.LongStream;

//Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//Function Description
//Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//aVeryBigSum has the following parameter(s):
//ar: an array of integers .

@Component
public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {

        return LongStream.of(ar).sum();
    }
}
