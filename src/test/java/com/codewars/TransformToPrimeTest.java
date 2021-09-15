package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TransformToPrimeTest {


    @Test
    public void checkSmallArraySize()
    {
        Assert.assertEquals(1, TransformToPrime.minimumNumber(new int[]{3,1,2}));
        Assert.assertEquals(0, TransformToPrime.minimumNumber(new int[]{5,2}));
        Assert.assertEquals(0, TransformToPrime.minimumNumber(new int[]{1,1,1}));
    }
    @Test
    public void checkLargerArraySize()
    {
        Assert.assertEquals(5, TransformToPrime.minimumNumber(new int[]{2,12,8,4,6}));
        Assert.assertEquals(2, TransformToPrime.minimumNumber(new int[]{50,39,49,6,17,28}));
    }
}