package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTripletsTest {

    @Test
    public void deveRetornarUmaVitóriaParaCada() {
        List<Integer> alice = new ArrayList<>(List.of(5, 6 , 7));
        List<Integer> bob = new ArrayList<>(List.of(3, 6, 10));

        List<Integer> score = new ArrayList<>(List.of(1, 1));

        List<Integer> result = CompareTheTriplets.compareTriplets(alice, bob);
        Assert.assertEquals(score, result);
    }


    @Test
    public void deveRetornarDuasVitóriasParaAliceEUmaParaBob() {
        List<Integer> alice = new ArrayList<>(List.of(17, 28, 30));
        List<Integer> bob = new ArrayList<>(List.of(99, 16, 8));

        List<Integer> score = new ArrayList<>(List.of(2, 1));

        List<Integer> result = CompareTheTriplets.compareTriplets(alice, bob);
        Assert.assertEquals(score, result);
    }
}


