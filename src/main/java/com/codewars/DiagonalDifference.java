package com.codewars;

import org.springframework.stereotype.Component;

import java.util.List;

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//        For example, the square matrix  is shown below:
//        1 2 3
//        4 5 6
//        9 8 9
//The left-to-right diagonal 1 + 5 + 9 = 15. The right to left diagonal 9 + 5 + 3 = 17. Their absolute difference is 2.

@Component
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int difference = 0;
        int sumA = 0;
        int sumB = 0;
        int count = arr.size()-1;

        for (int i = 0; i < arr.size(); i++) {
            sumA+= arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            sumB+= arr.get(i).get(count);
            count--;
        }

        difference = sumA - sumB;
        return Math.abs(difference);

    }

}
