package com.codewars;

import org.springframework.stereotype.Component;

//Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
//Print the decimal value of each fraction on a new line.
//Input Format
//The first line contains an integer, , denoting the size of the array.
//The second line contains n space-separated integers describing an array of numbers
//Output Format
//You must print the following  lines:
//A decimal representing of the fraction of positive numbers in the array compared to its size.
//A decimal representing of the fraction of negative numbers in the array compared to its size.
//A decimal representing of the fraction of zeros in the array compared to its size.
//        Sample Input
//        6
//        -4 3 -9 0 4 1
//        Sample Output
//        0.500000
//        0.333333
//        0.166667
//        Explanation
//        There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
//        The proportions of occurrence are positive: 3/6 = 0.500000, negative:  2/6 = 0.333333 and zeros: 1/6 = 0.166667.

@Component
public class PlusMinus {
    static void plusMinus(int[] arr) {
        double size = arr.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int value : arr) {
            if (value > 0) positive++;
            else if (value < 0) negative++;
            else zero++;
        }

        double positiveFraction = positive/size;
        double negativeFraction = negative/size;
        double zeroFraction = zero/size;

        System.out.printf("%.6f%n%.6f%n%.6f%n", positiveFraction, negativeFraction, zeroFraction);

    }

}
