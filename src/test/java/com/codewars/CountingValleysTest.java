package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;


class CountingValleysTest {

    CountingValleys countingValleys = new CountingValleys();

    @Test
    void deveRetornarUmQuandoVaiPorUmVale() {
        String s = "UDDDUDUU";
        int n = 8;

        int result = countingValleys.countingValleys(n, s);

        Assertions.assertEquals(1, result);
    }

    @Test
    void deveRetornarDoisQuandoVaiPorUmVale() {
        String s = "DDUUDDUDUUUD";
        int n = 12;

        int result = countingValleys.countingValleys(n, s);

        Assertions.assertEquals(2, result);
    }
}