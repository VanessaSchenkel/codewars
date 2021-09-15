package com.codewars;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;
import static java.util.Arrays.stream;

//You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string
// consisting of k consecutive strings taken in the array.
//
//        Examples:
//        strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
//
//        Concatenate the consecutive strings of strarr by 2, we get:
//
//        treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
//        folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
//        trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
//        blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
//        abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
//
//        Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
//        The first that came is "folingtrashy" so
//        longest_consec(strarr, 2) should return "folingtrashy".
//
//        In the same way:
//        longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
//        n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
//


public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k <= 0 || k > strarr.length) return "";

        StringBuilder wordRepeated = new StringBuilder();
        strarr = stream(strarr).distinct().toArray(String[]::new);
        if (k == 1) {
            sort(strarr, (a, b) -> b.length() - a.length());
            return strarr[0];
        }
        String[] bestCombination = new String[k];
        Arrays.fill(bestCombination, "");
        HashMap<Integer, String> teste = new HashMap<>();

        for (int i = 0; i < strarr.length; i++) {
            teste.put(i, strarr[i]);
            for (int j = 0; j < bestCombination.length; j++) {
                if (bestCombination[j].length() < strarr[i].length()) {
                    bestCombination[j] = strarr[i];
                    break;
                }
            }
        }

        HashMap<Integer, String> teste2 = new HashMap<>();
        for (int i = 0; i < teste.size(); i++) {
            for (int j = 0; j < bestCombination.length; j++) {
                if(teste.get(i).equals(bestCombination[j])){
                    String s = bestCombination[j];
                    Set<Integer> key = teste.entrySet()
                            .stream()
                            .filter(entry -> Objects.equals(entry.getValue(), s))
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toSet());

                    Object[] in = key.stream().toArray();
                    teste2.put((Integer) in[0], bestCombination[j]);
                }
            }
        }

        List<String> list = new ArrayList<String>(teste2.values());

        for (int i = 0; i < list.size(); i++) {
            wordRepeated.append(list.get(i));
        }

        return wordRepeated.toString();
    }

    public static String teste(String[] strarr, int k) {
        if (strarr.length == 0 || k <= 0 || k > strarr.length) return "";

        strarr = stream(strarr).distinct().toArray(String[]::new);

        if (k == 1) {
            sort(strarr, (a, b) -> b.length() - a.length());
            return strarr[0];
        }

        String [] longestCombination = new String[k];

        for (int i = 0; i < strarr.length; i++) {

        }

        return "";
    }

}
