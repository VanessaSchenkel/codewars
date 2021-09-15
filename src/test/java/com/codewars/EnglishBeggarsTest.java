package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EnglishBeggarsTest {

    @Test
    public void shouldReturnAmountTotalWhenHasOneBegger() {
        int[] values = {1, 2, 3, 4, 5};
        int beggers = 1;

        int[] expected = {15};
        int[] result = EnglishBeggars.beggars(values, beggers);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnAmountDividedWhenHasTwoBeggers() {
        int[] values = {1, 2, 3, 4, 5};
        int beggers = 2;

        int[] expected = {9,6};
        int[] result = EnglishBeggars.beggars(values, beggers);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void tester() throws Exception {
        // not my fault, but grouping tests in Java using `describe` is completely messed up
        // https://www.codewars.com/docs/java-test-reference
        // if can group, then do group these into basic and random tests

        // Basic tests
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
//        Assert.assertArrayEquals(a1, EnglishBeggars.beggars(test, 1));
//        Assert.assertArrayEquals(a2, EnglishBeggars.beggars(test, 2));
        Assert.assertArrayEquals(a3, EnglishBeggars.beggars(test, 3));
        Assert.assertArrayEquals(a4, EnglishBeggars.beggars(test, 6));
        Assert.assertArrayEquals(a5, EnglishBeggars.beggars(test, 0));
    }
}
