package com.codewars;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

//Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array
// of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2. There are three odd socks
// left, one of each color. The number of pairs is 2.

//sockMerchant has the following parameter(s):
//
//        n: the number of socks in the pile
//        ar: the colors of each sock

@Component
public class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        int parOfSocks = 0;

        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                parOfSocks++;
                colors.remove(ar[i]);
            }
        }

        return parOfSocks;
    }
}
