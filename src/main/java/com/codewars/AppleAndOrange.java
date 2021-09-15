package com.codewars;

//Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.
//Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s,t] )?
//For example, Sam's house is between s = 7 and t = 10. The apple tree is located at a = 4 and the orange at b = 12. There are m = 3 apples and n = 3 oranges. Apples are thrown
//apples = [2,3,4] units distance from a, and oranges = [3,2,4] units distance. Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4+4] = [6,7,0]. Oranges land at
//[12+3, 12+2, 12+4]=[15, 10, 8]. One apple and two oranges land in the inclusive range 7-10 so we print
//1
//2

//countApplesAndOranges has the following parameter(s):
//
//        s: integer, starting point of Sam's house location.
//        t: integer, ending location of Sam's house location.
//        a: integer, location of the Apple tree.
//        b: integer, location of the Orange tree.
//        apples: integer array, distances at which each apple falls from the tree.
//        oranges: integer array, distances at which each orange falls from the tree.

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//TODO tentar de novo

@Component
public class AppleAndOrange {

    static List<String> countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        List<String> retorno = new ArrayList<>();
        int quantApples = 0;
        int quantOranges = 0;

        for (int i = 0; i < apples.length; i++) {
            int applePosition = apples[i] + a;
            if (applePosition >= s && applePosition <= t) quantApples++;
        }

        for (int i = 0; i < oranges.length; i++) {
            int orangePosition = oranges[i] + b;
            if (orangePosition <= t && orangePosition >= s) quantOranges++;
        }

        retorno.add("Maçãs: " + quantApples);
        retorno.add("Laranjas: " + quantOranges);

        //System.out.println(quantApples);
        //System.out.println(quantOranges);

        return retorno;
    }
}
