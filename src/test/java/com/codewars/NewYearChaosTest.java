package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class NewYearChaosTest {


    @Test
    void deveRetornar1() {
        int[] line = {1,2,3,5,4,6,7,8};

        String result = NewYearChaos.minimumBribes(line);

        Assert.assertEquals("Swaps: 1", result);
    }

    @Test
    void deveRetornarTooChaotic() {
        int[] line = {8,2,3,5,4,6,7,1};

        String result = NewYearChaos.minimumBribes(line);

        Assert.assertEquals("Too chaotic", result);
    }

    @Test
    void deveRetornar4() {
        int[] line = {1,2,5,3,4,7,8,6};

        String result = NewYearChaos.minimumBribes(line);

        Assert.assertEquals("Swaps: 4", result);
    }


}