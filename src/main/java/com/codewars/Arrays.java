package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(20);
        list.add(43);

        list.set(3, list.get(3) + list.get(2));
        list.set(2, list.get(3) - list.get(2));
        list.set(3, list.get(3) - list.get(2));

        System.out.println(list.get(3));
    }

    public static int bub(List<Integer> list) {
        int swaps = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = 0; j < list.size() - 2; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swaps++;
                }
            }
        }
        System.out.println(list);
        return swaps;
    }
}
