package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class AVeryBigSumTest {

    @Test
    public void deveRetornarSumDosLongos() throws Exception {
        long[] ar = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};

        long result = AVeryBigSum.aVeryBigSum(ar);
        Assert.assertEquals(5000000015L, result);
    }
}
