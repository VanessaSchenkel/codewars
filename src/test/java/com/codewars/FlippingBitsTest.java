package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FlippingBitsTest {

    @Test
    public void deveRetornar2147483648L() throws Exception {

        long result = FlippingBits.flippingBits(2147483647L);
        Assert.assertEquals(2147483648L, result);
    }

}