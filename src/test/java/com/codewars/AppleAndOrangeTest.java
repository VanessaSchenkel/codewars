package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

    @Test
    public void deveRetornarLaranjasEMacas() throws Exception {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2,2,1};
        int[] oranges = {5, -6};

        List<String> result = AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges );
        Assert.assertEquals("Maçãs: 1", result.get(0));
        Assert.assertEquals("Laranjas: 1", result.get(1));
    }

}