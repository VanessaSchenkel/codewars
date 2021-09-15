package com.codewars;

import org.springframework.stereotype.Component;

import java.util.List;

//There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
//The elements of the first array are all factors of the integer being considered
//The integer being considered is a factor of all elements of the second array


//1. Find LCM of the first array a. (LCM = smallest positive integer that is perfectly divisible by both the numbers)
// 2.Find GCD / HCF of the second array b.
// 3.Find all the multiples of LCM up to GCD, which divides the GCD evenly.

//TODO VOLTAR
@Component
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        boolean var, var2;
        int i;
        int j;
        int m = 0;

        for (i = a.get(a.size() - 1); i <= b.get(0); i++) {
            var = false;
            for (j = 0; j < a.size(); j++) {
                if (i % a.get(j) == 0) {
                    var = true;
                } else {
                    var = false;
                    break;
                }
            }
            if (var) {
                var2 = false;
                for (int k = 0; k < b.size(); k++) {
                    if (b.get(k) % i == 0) {
                        var2 = true;
                    } else {
                        var2 = false;
                        break;
                    }

                }
                if (var2) {
                    m++;
                }
            }
        }
        return m;

    }
}
