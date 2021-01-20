package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class StringsMakingAnagramsTest {


    @Test
    void deveRetornar2() {

        int result = StringsMakingAnagrams.makeAnagram("cde", "dcf");

        Assert.assertEquals(2, result);
    }

    @Test
    void deveRetornar4() {

        int result = StringsMakingAnagrams.makeAnagram("cde", "abc");

        Assert.assertEquals(4, result);
    }


}