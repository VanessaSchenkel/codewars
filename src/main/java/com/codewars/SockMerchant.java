package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class SockMerchant {

    public int sockMerchant(int n, int[] ar) {
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            if (!unmatched.add(ar[i])){
                unmatched.remove(ar[i]);
                pairs++;
            }
        }
        return pairs;
    }
}
