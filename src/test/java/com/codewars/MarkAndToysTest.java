package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MarkAndToysTest {

    @Test
    void deveRetornar3() {
        int[] a = {1,2,3,4};

        int result = MarkAndToys.maximumToys(a, 7);

        Assert.assertEquals(3, result);
    }

    @Test
    void deveRetornar4() {
        int[] a = {1,12,5,111,200,1000,10};

        int result = MarkAndToys.maximumToys(a, 50);

        Assert.assertEquals(4, result);
    }
}