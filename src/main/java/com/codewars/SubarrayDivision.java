package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a chocolate bar, two children, Lily and Ron, are determining how to share it. Each of the squares has an integer on it.
//Lily decides to share a contiguous segment of the bar selected such that:
//
//        The length of the segment matches Ron's birth month, and,
//        The sum of the integers on the squares is equal to his birth day.
//
//You must determine how many ways she can divide the chocolate.
//
//Consider the chocolate bar as an array of squares, s=[2,2,1,3,2].
//She wants to find segments summing to Ron's birth day, d=4  with a length equalling his birth month, m=2.
//In this case, there are two segments meeting her criteria: [2,2] and [1,3].

//birthday has the following parameter(s):
//
//        s: an array of integers, the numbers on each of the squares of chocolate
//        d: an integer, Ron's birth day
//        m: an integer, Ron's birth month

@Component
public class SubarrayDivision {
    static int birthday(List<Integer> s, int d, int m) {
        int ways = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        for (int i = 0; i < s.size() - m + 1; i++) {
            if (sum == d){
                ways++;
            }

            if (i + m < s.size()){
                sum = sum - s.get(i) + s.get(i+m);
            }
        }

        return ways;
    }
}

