package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's
//score and the second being Bob's.
//        compareTriplets has the following parameter(s):
//        a: an array of integers representing Alice's challenge rating
//        b: an array of integers representing Bob's challenge rating
//Input Format
//The first line contains  space-separated integers a[0], a[1] and a[2] describing the respective values in triplet a.
//The second line contains  space-separated integers b[0], b[1] and b[2] describing the respective values in triplet b
//Output Format
//Return an array of two integers denoting the respective comparison points earned by Alice and Bob.
//Sample Input 0
//5 6 7
//3 6 10
//Sample Output 0
//1 1

@Component
public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobsScore = 0;


        for (int i = 0; i < a.size(); i++){
            if (a.get(i) > b.get(i)){
                aliceScore++;
            } else if (a.get(i) < b.get(i)){
                bobsScore++;
            }
        }
        return Arrays.asList(aliceScore, bobsScore);
    }
}
