package com.codewars;

//Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.

public class HighestScoringWord {
    public static String high(String s) {
        String[] sentence = s.toLowerCase().split(" ");
        int asciiConverter = 96;
        String biggestWord = sentence[0];
        int biggestValueSoFar = 0;
        int sumWord = 0;

        for (String value : sentence) {
            sumWord = 0;
            for (int j = 0; j < value.length(); j++) {
                sumWord += (value.charAt(j) - asciiConverter);
            }

            if (biggestValueSoFar < sumWord) {
                biggestValueSoFar = sumWord;
                biggestWord = value;
            }
        }

        return biggestWord;
    }
}
