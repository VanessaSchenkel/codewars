package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapAdjacentNumbers {

    public static List<Integer> swapAdjacent(List<Integer> array) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.size() - 1; i += 2) {
            int c = array.get(i) + array.get(i + 1);
            result.add(i, c - array.get(i));
            result.add(i + 1, c - array.get(i + 1));
        }

        return result;
    }
}

//    List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < array.size() - 1; i += 2) {
//        int c = array.get(i) + array.get(i + 1);
//        result.add(i, c - array.get(i));
//        result.add(i + 1, c - array.get(i + 1));
//        }
//
//        return result;