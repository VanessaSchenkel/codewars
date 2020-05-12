package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifferenceTest {

    @Test
    public void deveRetornarDiferençaAbsolutaDe15() {
        List<Integer> a = Arrays.asList(11,2,4);
        List<Integer> b = Arrays.asList(4,5,6);
        List<Integer> c = Arrays.asList(10,8,-12);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        int result = DiagonalDifference.diagonalDifference(arr);
        Assert.assertEquals(15, result);
    }

    @Test
    public void deveRetornarDiferençaAbsolutaDe2() {
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(4,5,6);
        List<Integer> c = Arrays.asList(9,8,9);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        int result = DiagonalDifference.diagonalDifference(arr);
        Assert.assertEquals(2, result);
    }
}


