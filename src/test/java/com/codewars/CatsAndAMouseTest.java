package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsAndAMouseTest {

    @Test
    void deveRetornarCatA() {

        String result = CatsAndAMouse.catAndMouse(2, 5, 3);

        Assertions.assertEquals("Cat A", result);
    }


    @Test
    void deveRetornarCatB() {

        String result = CatsAndAMouse.catAndMouse(2, 5, 4);

        Assertions.assertEquals("Cat B", result);
    }

    @Test
    void deveRetornarMouseC() {

        String result = CatsAndAMouse.catAndMouse(2, 4, 3);

        Assertions.assertEquals("Mouse C", result);
    }
}