package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EletronicShopTest {

    @Test
    void deveRetornar58() {

        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};

        int result = ElectronicsShop.getMoneySpent(keyboards, drives, 60);

        Assertions.assertEquals(58, result);
    }

    @Test
    void deveRetornarMenos1() {

        int[] keyboards = {40, 500, 600};
        int[] drives = {100, 80, 120};

        int result = ElectronicsShop.getMoneySpent(keyboards, drives, 45);

        Assertions.assertEquals(-1, result);
    }

    @Test
    void deveRetornar9() {

        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};

        int result = ElectronicsShop.getMoneySpent(keyboards, drives, 10);

        Assertions.assertEquals(9, result);
    }

}