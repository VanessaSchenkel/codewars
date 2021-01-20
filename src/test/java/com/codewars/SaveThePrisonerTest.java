package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SaveThePrisonerTest {

    @Test
    public void deveRetornar3() throws Exception {

        int result = SaveThePrisoner.saveThePrisoner(4, 6, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void deveRetornar2() throws Exception {

        int result = SaveThePrisoner.saveThePrisoner(5, 2, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void deveRetornar6() throws Exception {

        int result = SaveThePrisoner.saveThePrisoner(7, 19, 2);
        Assert.assertEquals(6, result);
    }

    @Test
    public void deveRetornar3D() throws Exception {

        int result = SaveThePrisoner.saveThePrisoner(3, 7, 3);
        Assert.assertEquals(3, result);
    }
}