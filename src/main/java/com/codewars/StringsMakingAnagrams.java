package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;

//A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other
// if the first string's letters can be rearranged to form the second string. In other words, both strings must contain
// the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
//Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
//        Example
//        a="cde"
//        b="dce"
//        Delete e from a and f from b so that the remaining strings are cd and dc which are anagrams. This takes 2 character deletions.

//makeAnagram has the following parameter(s):
//
//        string a: a string
//        string b: another string
//        Returns
//
//        int: the minimum total characters that must be deleted
@Component
public class StringsMakingAnagrams {
    static int makeAnagram(String a, String b) {
        int[] freq = new int[26];
        a.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        b.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        return Arrays.stream(freq).map(Math::abs).sum();
    }
}
