package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Stack;

//You are given a string containing characters A and B only. Your task is to change it into a string such that there are
// no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
//Your task is to find the minimum number of required deletions.
//Example
//        s = AABAAB
//        Remove an A at positions 0 and 3 to make s=ABAB in 2 deletions.

@Component
public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        if (!s.contains("A") || !s.contains("B")) return s.length()-1;

        int deletions = 0;
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (stack.peek() == s.charAt(i)){
                deletions++;
            } else  {
                stack.push(s.charAt(i));
            }
        }
        return deletions;
    }
}
