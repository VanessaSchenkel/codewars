package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class UtopianTreeTest {


    @Test
    void deveRetornar1() {

        int result = UtopianTree.utopianTree(0);

        Assert.assertEquals(1, result);
    }

    @Test
    void deveRetornar2() {

        int result = UtopianTree.utopianTree(1);

        Assert.assertEquals(2, result);
    }

    @Test
    void deveRetornar3() {

        int result = UtopianTree.utopianTree(2);

        Assert.assertEquals(3, result);
    }


}