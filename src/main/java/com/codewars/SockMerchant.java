package com.codewars;

import org.springframework.stereotype.Component;

import java.util.HashSet;

//John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of
// integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching
// pairs of socks that are available.
//
//sockMerchant has the following parameter(s):
//n: the number of socks in the pile
//ar: the colors of each sock
//Input Format
//The first line contains an integer n, the number of socks represented in ar.
//The second line contains n space-separated integers describing the colors  of the socks in the pile.
//Output Format
//Return the total number of matching pairs of socks that John can sell.
//
//Sample Input
//9
//10 20 20 10 10 30 50 10 20
//Sample Output
//3

@Component
public class SockMerchant {

    public int sockMerchant(int n, int[] ar) {
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            if (!unmatched.add(ar[i])) {
                unmatched.remove(ar[i]);
                pairs++;
            }
        }
        return pairs;
    }
}
