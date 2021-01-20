package com.codewars;

import org.springframework.stereotype.Component;

//Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i < j and ar[i] + ar[j] is divisible by k.
//
//ar = [1, 2, 3, 4, 5, 6]
////k =5
//Three pairs meet the criteria: [1,4], [2,3]  and [4,6].

//Complete the divisibleSumPairs function in the editor below.
//
//        divisibleSumPairs has the following parameter(s):
//
//        int n: the length of array ar
//        int ar[n]: an array of integers
//        int k: the integer divisor

//Returns
//        - int: the number of pairs

@Component
public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int total = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (((ar[i] + ar[j]) % k == 0) && i < j){
                    total++;
                }
            }
        }

        return total;

    }
}
