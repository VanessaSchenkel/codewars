package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class ReplacementTest {

    @Test
    public void exampleTests() {

        Assert.assertArrayEquals("m", new int[]{1}, Replacement.replacement(new int[]{42}) );
        Assert.assertArrayEquals("m", new int[]{1, 2}, Replacement.replacement(new int[]{ 3, 2}) );
        Assert.assertArrayEquals("m", new int[]{1,1,2,3,4}, Replacement.replacement(new int[]{1,2,3,4,5}) );
        Assert.assertArrayEquals("m", new int[]{1,1,2,3,4}, Replacement.replacement(new int[]{4,2,1,3,5}) );
        Assert.assertArrayEquals("m", new int[]{1,2,2}, Replacement.replacement(new int[]{2,2,2}) );
        Assert.assertArrayEquals("m", new int[]{1,1,2}, Replacement.replacement(new int[]{1,1,1}) );

    }
}
