package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class Bubble {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(bub(list));
    }

    public static int bub(List<Integer> list){
        int swaps = 0;
        for (int i = 0; i < list.size()-2; i++) {
            for (int j = 0; j < list.size()-2; j++) {
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j +1));
                    list.set(j+1, temp);
                    swaps++;
                }
            }
        }
        System.out.println(list);
        return swaps;
    }
}
