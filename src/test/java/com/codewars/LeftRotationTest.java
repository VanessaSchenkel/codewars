package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class LeftRotationTest {


    @Test
    void deveRetornarPrimeiro3() {
        int[] ar = {1,2,3,4,5};

        int[] result = LeftRotation.rotLeft(ar, 2);

        Assert.assertEquals(3, result[0]);
        Assert.assertEquals(4, result[1]);
        Assert.assertEquals(5, result[2]);
        Assert.assertEquals(1, result[3]);
        Assert.assertEquals(2, result[4]);
    }

    @Test
    void deveRetornarPrimeiro5() {
        int[] ar = {1,2,3,4,5};

        int[] result = LeftRotation.rotLeft(ar, 4);

        Assert.assertEquals(5, result[0]);
        Assert.assertEquals(1, result[1]);
        Assert.assertEquals(2, result[2]);
        Assert.assertEquals(3, result[3]);
        Assert.assertEquals(4, result[4]);
    }


}