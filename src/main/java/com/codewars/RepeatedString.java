package com.codewars;

import org.springframework.stereotype.Component;

//Lilah has a string s of lowercase English letters that she repeated infinitely many times.
//
//Given an integer, n , find and print the number of letter a's in the first  letters of Lilah's infinite string.
//For example, if the string s="abcs" and n=10, the substring we consider is "abcsabcsab", the first  characters of her infinite string.
//There are 4 occurrences of a in the substring.
//Function Description
//Complete the repeatedString function in the editor below. It should return an integer representing the number of
// occurrences of a in the prefix of length  in the infinitely repeating string.
//repeatedString has the following parameter(s):
//s: a string to repeat
//n: the number of characters to consider
//Input Format
//The first line contains a single string, .
//The second line contains an integer, .
//
//Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by
// repeating  infinitely many times.
//Sample Input 0
//aba
//10
//Sample Output 0
//7

@Component
public class RepeatedString {
    static long repeatedString(String s, long n) {
        long numberOfAsTotal = 0;
        long numberOfAsWord = 0;
        StringBuilder newWord = new StringBuilder(s);

        if (s.equals("a")) return n;
        if (!s.contains("a")) return 0L;

        int i = 0;
        while (i < newWord.length()) {
            if (newWord.charAt(i) == 'a') numberOfAsWord++;
            i++;
        }
        long vezes = (n / s.length());
        long faltou = n - (vezes * s.length());
        numberOfAsTotal = numberOfAsWord * vezes;

        for (int j = 0; j < faltou; j++) {
            if (s.charAt(j) == 'a') numberOfAsTotal++;
        }

        return numberOfAsTotal;

    }

}
