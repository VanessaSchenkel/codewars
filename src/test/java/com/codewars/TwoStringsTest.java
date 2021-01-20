package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TwoStringsTest {

    @Test
    public void deveRetornarYes() throws Exception {
        String result = TwoStrings.twoStrings("and", "art");
        Assert.assertEquals("YES", result);
    }

    @Test
    public void deveRetornarNo() throws Exception {
        String result = TwoStrings.twoStrings("be", "cat");
        Assert.assertEquals("NO", result);
    }

}