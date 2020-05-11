package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SockMerchantTest {
    SockMerchant sockMerchant = new SockMerchant();

    @Test
    void deveRetornarTresParesDeMeia() {
        int[] arr = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant.sockMerchant(9, arr);
        Assertions.assertEquals(3, result);
    }
}
