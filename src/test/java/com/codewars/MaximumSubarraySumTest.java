package com.codewars;


import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;


public class MaximumSubarraySumTest {

    @Test
    public void basic() {
        assertEquals("devia ser 0", 0, MaximumSubarraySum.sequence(new int[]{}));
        assertEquals("devia ser 10", 10, MaximumSubarraySum.sequence(new int[]{10}));
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySum.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
