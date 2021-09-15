package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;

//Given a List [] of n integers , find minimum number to be inserted in a list, so that sum of all elements of list
// should equal the closest prime number .
//Input >> Output Examples
//        1- minimumNumber ({3,1,2}) ==> return (1)
//        Explanation:
//        Since , the sum of the list's elements equal to (6) , the minimum number to be inserted to transform the sum
//        to prime number is (1) , which will make the sum of the List equal the closest prime number (7) .
//
//
//        2-  minimumNumber ({2,12,8,4,6}) ==> return (5)
//        Explanation:
//        Since , the sum of the list's elements equal to (32) , the minimum number to be inserted to transform the sum
//        to prime number is (5) , which will make the sum of the List equal the closest prime number (37) .
@Component
public class TransformToPrime {
    public static int minimumNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();

        int diference = 0;
        while (!isItPrime(sum)) {
            isItPrime(sum++);
            diference++;
        }
        return diference;

    }

    public static boolean isItPrime(int number) {
        boolean isItPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                isItPrime = false;
                break;
            }
        }

        return isItPrime;

    }
}
