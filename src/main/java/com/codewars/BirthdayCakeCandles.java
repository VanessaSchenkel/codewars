package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;

//You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of
//her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find
//out how many candles she can successfully blow out.
//For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 3, 1,
//she will be able to blow out 2 candles successfully, since the tallest candles are of height 4 and there are 2 such candles.
//        Sample Input 0
//        4
//        3 2 1 3
//        Sample Output 0
//        2
@Component
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int max = Arrays.stream(ar).max().getAsInt();
        int count = 0;

        for (int value : ar) {
            if (value == max) count++;
        }

        return count;
    }
}
