package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.IntStream;

//Introduction
//        Little Petya very much likes sequences. However, recently he received a sequence as a gift from his mother.
//        Petya didn't like it at all! He decided to make a single replacement. After this replacement, Petya would like to the sequence in increasing order.
//        He asks himself: What is the lowest possible value I could have got after making the replacement and sorting the sequence?
//
//        About the replacement
//        Choose exactly one element from the sequence and replace it with another integer > 0. You are not allowed to replace a number with itself, or to change no number at all.
//
//        Task
//        Find the lowest possible sequence after performing a valid replacement, and sorting the sequence.
//
//        Input:
//        Input contains sequence with N integers. All elements of the sequence > 0. The sequence will never be empty.
//
//        Output:
//        Return sequence with N integers — which includes the lowest possible values of each sequence element, after the single replacement and sorting has been performed.
//
//        Examples:
//
//        ([1,2,3,4,5])  =>  [1,1,2,3,4]
//        ([4,2,1,3,5])  =>  [1,1,2,3,4]
//        ([2,3,4,5,6])  =>  [1,2,3,4,5]
//        ([2,2,2])      =>  [1,2,2]
//        ([42])         =>  [1]
//        ([1, 1, 1])    =>  [1, 1, 2]
@Component
public class Replacement {
    public static int[] replacement(final int[] arr) {
        int[] result = new int[arr.length];
        result[0] = 1;
        if (arr.length == 1) {
            return result;
        }

        Arrays.sort(arr);

        int iterator = 1;
        for (int i = 0; i < arr.length-1; i++) {
            result[iterator] = arr[i];
            iterator++;
        }

        if(arr[arr.length-1] == 1){
            result[arr.length-1] = 2;
            Arrays.sort(result);
        }

        return result;


//        Arrays.sort(arr);
//        int i = arr.length - 1;
//        arr[i] = arr[i] != 1 ? 1 : 2;
//        Arrays.sort(arr);
//        return arr;

    }
}
