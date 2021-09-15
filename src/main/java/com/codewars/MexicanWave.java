package com.codewars;

//Task
//        In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
//        Rules
//        1.  The input string will always be lower case but maybe empty.
//
//        2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//        Example
//        wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        if (str.equals("")) {
            return new String[]{};
        }


       ArrayList<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char charAtTheWord = str.charAt(i);
            char upChar = Character.toUpperCase(charAtTheWord);

            String newWord = "";

            for (int j = 0; j < str.length(); j++) {
                if (j == i) {
                    newWord += upChar;
                } else {
                    newWord += str.charAt(j);
                }
            }
            if(!newWord.equals(str)){
                wave.add(newWord);
            }
        }

        String[] result = new String[wave.size()];

        for (int i = 0; i < wave.size(); i++) {
            result[i] = wave.get(i);
        }

        return result;
    }
}
