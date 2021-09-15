package com.codewars;
import static java.lang.Character.toUpperCase;

//Input Strings a and b: For every character in string a swap the casing of every occurrence of the same character in
// string b. Then do the same casing swap with the inputs reversed. Return a single string consisting of the changed
// version of a followed by the changed version of b. A char of a is in b regardless if it's in upper or lower case -
// see the testcases too.
//        I think that's all;-)...
//
//        Some easy examples:
//
//        Input: "abc" and "cde"      => Output: "abCCde"
//        Input: "ab" and "aba"       => Output: "aBABA"
//        Input: "abab" and "bababa"  => Output: "ABABbababa"

//Once again for the last example - description from KenKamau, see discourse;-):
//
//        a) swap the case of characters in string b for every occurrence of that character in string a
//        char 'a' occurs twice in string a, so we swap all 'a' in string b twice. This means we start with "bababa" then "bAbAbA" => "bababa"
//        char 'b' occurs twice in string a and so string b moves as follows: start with "bababa" then "BaBaBa" => "bababa"
//
//        b) then, swap the case of characters in string a for every occurrence in string b
//        char 'a' occurs 3 times in string b. So string a swaps cases as follows: start with "abab" then => "AbAb" => "abab" => "AbAb"
//        char 'b' occurs 3 times in string b. So string a swaps as follow: start with "AbAb" then => "ABAB" => "AbAb" => "ABAB".
//
//        c) merge new strings a and b
//        return "ABABbababa"

public class PlayWithTwoStrings {
    public static String toggle(String a, String b) {

        char b_arr[] = b.toCharArray();
        for (char ac : a.toCharArray()) {
            for (int k = 0; k < b_arr.length; k++) {
                char bc = b_arr[k];
                if (toUpperCase(ac) == toUpperCase(bc)) b_arr[k] = Character.valueOf((char)(bc ^ 32));
            }
        }
        return new String(b_arr);
    }

    public static String workOnStrings(String a, String b) {
        String new_b = toggle(a, b), new_a = toggle(new_b, a);
        return new_a + new_b;
    }
}
