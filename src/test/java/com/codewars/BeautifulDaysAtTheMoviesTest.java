package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BeautifulDaysAtTheMoviesTest {

    @Test
    public void deveRetornar2() throws Exception {

        int result = BeautifulDaysAtTheMovies.beautifulDays(20, 23, 6);
        Assert.assertEquals(2, result);
    }

    @Test
    public void deveRetornar33() throws Exception {

        int result = BeautifulDaysAtTheMovies.beautifulDays(13, 45, 3);
        Assert.assertEquals(33, result);
    }

}