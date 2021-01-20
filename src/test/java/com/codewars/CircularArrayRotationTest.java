package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CircularArrayRotationTest {

    @Test
    public void deveRetornar2() throws Exception {
        int[] a = {3, 4, 5};
        int k = 2;
        int[] queries = {1, 2};

        int[] result = CircularArrayRotation.circularArrayRotation(a, k, queries);
        Assert.assertEquals(5, result[0]);
        Assert.assertEquals(3, result[1]);
    }

}