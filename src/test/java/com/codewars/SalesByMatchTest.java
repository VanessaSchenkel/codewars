package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SalesByMatchTest {

    @Test
    void deveRetornar3Pares() {

        int[] socks = {10, 20,20,10,10,30,50,10,20};

        int result = SalesByMatch.sockMerchant(9, socks);

        Assertions.assertEquals(3, result);
    }

    @Test
    void deveRetornar2Pares() {

        int[] socks = {1, 2, 1, 2, 1, 3, 2};

        int result = SalesByMatch.sockMerchant(7, socks);

        Assertions.assertEquals(2, result);
    }

    @Test
    void deveRetornar30Pares() {

        int[] socks = {44, 55, 11, 15, 4, 72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17, 54, 65, 60, 21, 58,
                98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44, 45, 23, 38, 22, 44, 65, 9, 78, 42, 100, 94, 58, 5,
                11, 69, 26, 20, 19, 64, 64, 93, 60, 96, 10, 10, 39, 94, 15, 4, 3, 10, 1, 77, 48, 74, 20, 12, 83, 97, 5, 82,
                43, 15, 86, 5, 35, 63, 24, 53, 27, 87, 45, 38, 34, 7, 48, 24, 100, 14, 80, 54};

        int result = SalesByMatch.sockMerchant(100, socks);

        Assertions.assertEquals(30, result);
    }

}