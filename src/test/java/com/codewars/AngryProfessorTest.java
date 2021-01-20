package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class AngryProfessorTest {

    @Test
    public void deveRetornarLaranjasEMacas() throws Exception {
        int[] t = {-1, -3, 4, 2};

        String result = AngryProfessor.angryProfessor(3, t);
        Assert.assertEquals("YES", result);
    }


    @Test
    public void deveRetornarYes() throws Exception {
        int[] t = {-1, -3, 4, 2};

        String result = AngryProfessor.angryProfessor(2, t);
        Assert.assertEquals("NO", result);
    }

    @Test
    public void deveRetornarYesComMais() throws Exception {
        int[] t = {-1, -3, -2, 4, 2};

        String result = AngryProfessor.angryProfessor(2, t);
        Assert.assertEquals("NO", result);
    }
}