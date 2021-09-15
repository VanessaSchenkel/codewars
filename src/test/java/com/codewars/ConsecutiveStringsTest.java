package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveStringsTest {

    @Test
    public void basic(){
        testing(ConsecutiveStrings.longestConsec(new String[] {}, 3), "");
        testing(ConsecutiveStrings.longestConsec(new String[] {"zone"}, 1), "zone");
        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "tio"}, 1), "zone");
        testing(ConsecutiveStrings.longestConsec(new String[] {"tio", "zone"}, 1), "zone");
        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "tio"}, 2), "zonetio");
    }

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
//        testing(ConsecutiveStrings.longestConsec(new String[] {}, 3), "");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        //testing(ConsecutiveStrings.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(ConsecutiveStrings.longestConsec(new String[] {"aaaa","bbbbb","cc"}, 2), "aaaabbbbb");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
//        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
}
