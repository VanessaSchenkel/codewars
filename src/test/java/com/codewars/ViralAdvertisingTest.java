package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ViralAdvertisingTest {

    @Test
    public void deveRetornar24() throws Exception {

        int result = ViralAdvertising.viralAdvertising(5);
        Assert.assertEquals(24, result);
    }

    @Test
    public void deveRetornar2() throws Exception {

        int result = ViralAdvertising.viralAdvertising(1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void deveRetornar5() throws Exception {

        int result = ViralAdvertising.viralAdvertising(2);
        Assert.assertEquals(5, result);
    }

}