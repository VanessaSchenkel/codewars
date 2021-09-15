package com.codewars;
//
//In this kata you will be given an integer n, which is the number of times that is thown a coin. You will have to
// return an array of string for all the possibilities (heads[H] and tails[T]). Examples:
//
//        coin(1) should return {"H", "T"}
//        coin(2) should return {"HH", "HT", "TH", "TT"}
//        coin(3) should return {"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"}
//
//        When finished sort them alphabetically.
//
//        INPUT:
//        0 < n < 18
//
//        Careful with performance!! You'll have to pass 3 basic test (n = 1, n = 2, n = 3), many medium tests
//        (3 < n <= 10) and many large tests (10 < n < 18)

import java.util.ArrayList;
import java.util.List;

public class PossibilitiesOfThrowingACoinNtimes {
    public String[] coin(int n) {
        String[] combination = new String[(int) Math.pow(2, n)];

        for (int i = 0; i < Math.pow(2, n); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            Integer.toBinaryString(i)
                    .chars()
                    .map(o -> (o == '1') ? 'H' : 'T')
                    .forEachOrdered(o -> stringBuilder.append((char) o));

            while (stringBuilder.length() < n){
                stringBuilder.insert(0, 'T');
            }

            combination[combination.length - (i+1)] = stringBuilder.toString();
        }

        return combination;
    }
}
