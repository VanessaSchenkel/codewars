package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTest {

    @Test
    public void deveDarTresPulos() throws Exception {
        int[] lista = {0, 0, 0, 0, 1, 0};
        int result = JumpingOnTheClouds.jumpingOnClouds(lista);
        Assert.assertEquals(3, result);
    }

    @Test
    public void deveDarQuatroPulos() throws Exception {
        int[] lista = {0, 0, 1, 0, 0, 1, 0};
        int result = JumpingOnTheClouds.jumpingOnClouds(lista);
        Assert.assertEquals(4, result);
    }

    @Test
    public void deveDarTresPulosRecebendo7() throws Exception {
        int[] lista = {0, 0, 0, 1, 0, 0};
        int result = JumpingOnTheClouds.jumpingOnClouds(lista);
        Assert.assertEquals(3, result);
    }
}