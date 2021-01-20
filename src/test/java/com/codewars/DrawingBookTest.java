package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DrawingBookTest {

    @Test
    void deveRetornar1ComecandoPelaFrente() {

        int result = DrawingBook.pageCount(6, 2);

        Assertions.assertEquals(1, result);
    }

    @Test
    void deveRetornar0PorSerPrimeiraPagina() {

        int result = DrawingBook.pageCount(5, 1);

        Assertions.assertEquals(0, result);
    }

    @Test
    void deveRetornar1ComecandoPorTras() {

        int result = DrawingBook.pageCount(6, 5);

        Assertions.assertEquals(1, result);
    }


    @Test
    void deveRetornar0() {

        int result = DrawingBook.pageCount(5, 4);

        Assertions.assertEquals(0, result);
    }

    @Test
    void deveRetornar1QuandoQuerATerceira() {

        int result = DrawingBook.pageCount(7, 3);

        Assertions.assertEquals(1, result);
    }

    @Test
    void deveRetornar3478() {

        int result = DrawingBook.pageCount(15603, 6957);

        Assertions.assertEquals(3478, result);
    }

}