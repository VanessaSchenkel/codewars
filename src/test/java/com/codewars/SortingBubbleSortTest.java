package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class SortingBubbleSortTest {


    @Test
    void deveRetornar3() {
        int[] a = {6,4,1};

        List<String> result = SortingBubbleSort.countSwaps(a);

        Assert.assertEquals("Array is sorted in 3 swaps.", result.get(0));
        Assert.assertEquals("First Element: 1", result.get(1));
        Assert.assertEquals("Last Element: 6", result.get(2));
    }

    @Test
    void deveRetornar0() {
        int[] a = {1, 2 , 3};

        List<String> result = SortingBubbleSort.countSwaps(a);

        Assert.assertEquals("Array is sorted in 0 swaps.", result.get(0));
        Assert.assertEquals("First Element: 1", result.get(1));
        Assert.assertEquals("Last Element: 3", result.get(2));
    }


}