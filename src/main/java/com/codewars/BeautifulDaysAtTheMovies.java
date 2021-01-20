package com.codewars;

import org.springframework.stereotype.Component;

//Lily likes to play games with integers. She has created a new game where she determines the difference between a number
// and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120 reversed is 21, and their difference is 99.
//She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
//Given a range of numbered days,[i...j]  and a number k, determine the number of days in the range that are beautiful. Beautiful
// numbers are defined as numbers where |i-reverse(i)| is evenly divisible by k. If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

//int i: the starting day number
//        int j: the ending day number
//        int k: the divisor
//        Returns
//
//        int: the number of beautiful days in the range

@Component
public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int totalDays = 0;

        for (int l = i; l <= j; l++) {
            int reverse = reverseInt(l);
            if ((l - reverse) % k == 0) {
                totalDays++;
            }
        }

        return totalDays;
    }

    public static int reverseInt(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return (int) reversedNum;
    }
}
