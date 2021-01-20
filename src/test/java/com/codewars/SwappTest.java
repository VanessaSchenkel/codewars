package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SwappTest {

    @Test
    public void deveRetornar2() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> result = SwapAdjacentNumbers.swapAdjacent(list);
        Assert.assertEquals(java.util.Optional.of(2), result.get(0));
    }

}