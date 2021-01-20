package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlternatingCharactersTest {

    @Test
    public void deveRetornar2() throws Exception {

        int result = AlternatingCharacters.alternatingCharacters("AABAAB");
        Assert.assertEquals(2, result);
    }

    @Test
    public void deveRetornar3() throws Exception {

        int result = AlternatingCharacters.alternatingCharacters("AAAA");
        Assert.assertEquals(3, result);
    }

    @Test
    public void deveRetornar4() throws Exception {

        int result = AlternatingCharacters.alternatingCharacters("BBBBB");
        Assert.assertEquals(4, result);
    }

    @Test
    public void deveRetornar0() throws Exception {

        int result = AlternatingCharacters.alternatingCharacters("ABABABAB");
        Assert.assertEquals(0, result);
    }

    @Test
    public void deveRetornar6() throws Exception {

        int result = AlternatingCharacters.alternatingCharacters("AAABBBAABB");
        Assert.assertEquals(6, result);
    }
}