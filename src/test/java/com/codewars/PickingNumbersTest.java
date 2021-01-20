package com.codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PickingNumbersTest {

    @Test
    void deveRetornar5() {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);
        int result = PickingNumbers.pickingNumbers(a);

        Assertions.assertEquals(5, result);
    }

    @Test
    void deveRetornar3() {

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);

        int result = PickingNumbers.pickingNumbers(a);

        Assertions.assertEquals(3, result);
    }

    @Test
    void deveRetornar5Quando() {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);

        int result = PickingNumbers.pickingNumbers(a);

        Assertions.assertEquals(5, result);
    }

}