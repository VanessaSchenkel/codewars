package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PlayWithTwoStringsTest {


    @Test
    public void Sample_tests() {
        Assert.assertEquals("abCCde", PlayWithTwoStrings.workOnStrings("abc","cde"));
        Assert.assertEquals("abcDeFGtrzWDEFGgGFhjkWqE", PlayWithTwoStrings.workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        Assert.assertEquals("abcDEfgDEFGg", PlayWithTwoStrings.workOnStrings("abcdeFg", "defgG"));
        Assert.assertEquals("ABABbababa", PlayWithTwoStrings.workOnStrings("abab", "bababa"));
    }
}
