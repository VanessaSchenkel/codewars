package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class TheHurdleRaceTest {

    @Test
    public void deveRetornar0() throws Exception {
        int[] height = {2, 5, 4, 5, 2};

        int result = TheHurdleRace.hurdleRace(7, height);
        Assert.assertEquals(0, result);
    }

    @Test
    public void deveRetornar2() throws Exception {
        int[] height = {1, 6, 3, 5, 2};

        int result = TheHurdleRace.hurdleRace(4, height);
        Assert.assertEquals(2, result);
    }

}