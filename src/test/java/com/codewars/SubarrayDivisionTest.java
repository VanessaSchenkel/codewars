package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class SubarrayDivisionTest {

    @Test
    void deveRetornar2Jeitos() {

        List<Integer> squares = new ArrayList<>();
        squares.add(1);
        squares.add(2);
        squares.add(1);
        squares.add(3);
        squares.add(2);

        int result = SubarrayDivision.birthday(squares, 3, 2);

        Assertions.assertEquals(2, result);
    }

    @Test
    void deveRetornar0Jeitos() {

        List<Integer> squares = new ArrayList<>();
        squares.add(1);
        squares.add(1);
        squares.add(1);
        squares.add(1);
        squares.add(1);
        squares.add(1);

        int result = SubarrayDivision.birthday(squares, 3, 2);

        Assertions.assertEquals(0, result);
    }

    @Test
    void deveRetornar0JeitosTeste() {

        List<Integer> squares = new ArrayList<>();
        squares.add(1);
        squares.add(2);
        squares.add(3);
        squares.add(4);
        squares.add(5);

        int result = SubarrayDivision.birthday(squares, 10, 2);

        Assertions.assertEquals(0, result);
    }

    @Test
    void deveRetornar0JeitosTesteAqui() {

        List<Integer> squares = new ArrayList<>();
        squares.add(1);
        squares.add(2);
        squares.add(3);
        squares.add(4);
        squares.add(5);

        int result = SubarrayDivision.birthday(squares, 100, 3);

        Assertions.assertEquals(0, result);
    }

}