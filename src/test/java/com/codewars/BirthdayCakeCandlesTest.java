package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class BirthdayCakeCandlesTest {

    @Test
    public void deveRetornarDoisComDoisNumerosAltos() throws Exception {
        int[] ar = {3, 2, 1, 3};
        int result = BirthdayCakeCandles.birthdayCakeCandles(ar);
        Assert.assertEquals(2, result);
    }
}

