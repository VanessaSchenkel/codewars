package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class MinimumAbsoluteDifferenceInAnArrayTest {


    @Test
    void deveRetornar5() {
        int[] arr = {3, -7, 0};

        int result = MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(arr);

        Assert.assertEquals(3, result);
    }

    @Test
    void deveRetornar1() {
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};

        int result = MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(arr);

        Assert.assertEquals(1, result);
    }

    @Test
    void deveRetornar3() {
        int[] arr = {1, -3, 71, 68, 17};

        int result = MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(arr);

        Assert.assertEquals(3, result);
    }


}