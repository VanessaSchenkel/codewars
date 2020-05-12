package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class SimpleArraySumTest {

    @Test
    public void deveRetornar31comoSomaDosValores() throws Exception {
        int[] ar = {1, 2, 3, 4, 10, 11};
        int result = SimpleArraySum.simpleArraySum(ar);
        Assert.assertEquals(31, result);
    }
}

