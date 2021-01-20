package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given two strings, determine if they share a common substring. A substring may be as small as one character.
//        Example
//        s1 = "and"
//        s1 = "art"
//        These share the common substring a.
//        s1 = "be"
//        s1 = "cat"
//        These do not share a substring.
//        Returns
//        string: either YES or NO
@Component
public class TwoStrings {
    static String twoStrings(String s1, String s2) {

        Set<Character> firstWord = s1.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());

        Set<Character> secondWord = s2.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());

        firstWord.retainAll(secondWord);

        if(firstWord.size() > 0){
            return "YES";
        } else return "NO";

    }
}
