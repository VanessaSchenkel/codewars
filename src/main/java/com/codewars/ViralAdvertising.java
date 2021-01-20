package com.codewars;

//HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it
// to exactly 5 people on social media.
//On the first day, half of those 5 people (i.e., 5/2 = 2 ) like the advertisement and each shares it with 3 of their friends.
//At the beginning of the second day, floor(5/2) x 3 = 2 x 3 = 6 people receive the advertisement.

//Function Description
//
//        Complete the viralAdvertising function in the editor below.
//
//        viralAdvertising has the following parameter(s):
//
//        int n: the day number to report
//        Returns
//
//        int: the cumulative likes at that day
//        Input Format
//
//        A single integer, n, the day number.

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int cumulateLikes = 0;
        int people = 5;

        for (int i = 1; i <= n; i++) {
            people = Math.floorDiv(people, 2);
            cumulateLikes += people;
            people *= 3;
        }

        return cumulateLikes;
    }
}
