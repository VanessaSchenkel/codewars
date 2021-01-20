package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if 2 left
// rotations are performed on array [1,2,3,4,5] , then the array would become [3,4,5,1,2]. Note that the lowest index item moves to the highest
// index in a rotation. This is called a circular array.

//rotLeft has the following parameter(s):
//
//        int a[n]: the array to rotate
//        int d: the number of rotations
//        Returns
//
//        int a'[n]: the rotated array

@Component
public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {

        List<Integer> list = new ArrayList<>();
        for (int i = d; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < d; i++) {
            list.add(a[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
