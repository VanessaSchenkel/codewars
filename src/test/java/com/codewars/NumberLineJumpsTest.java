package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class NumberLineJumpsTest {

    @Test
    public void deveRetornarNo() throws Exception {

        String result = NumberLineJumps.kangaroo(0, 2,5,3);
        Assert.assertEquals("NO", result);
    }

    @Test
    public void deveRetornarYes() throws Exception {

        String result = NumberLineJumps.kangaroo(0, 3,4,2);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void deveRetornarYesQuandoSeEncontram() throws Exception {

        String result = NumberLineJumps.kangaroo(10, 3,0,13);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void deveRetornarNoQuandoTest() throws Exception {

        String result = NumberLineJumps.kangaroo(21, 6,47,3);
        Assert.assertEquals("NO", result);
    }

}


