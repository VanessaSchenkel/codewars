package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SwapAdjacentNumbersTest {

    @Test
    public void deveRetornar2() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> result = SwapAdjacentNumbers.swapAdjacent(list);

        //Assert.assertEquals(2, result.get(0));
    }

}