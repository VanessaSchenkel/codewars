package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormingAMagicSquareTest {
    @Test
    void deveRetornar1() {

        int[][] twoD = {  {4,   9,  2}, { 3,  5,  7}, { 8,  1,  5} };

        int result = FormingAMagicSquare.formingMagicSquare(twoD);

        Assertions.assertEquals(1, result);
    }

    @Test
    void deveRetornar4() {

        int[][] twoD = {  {4,   8,  2}, { 4,  5,  7}, { 6,  1,  6} };

        int result = FormingAMagicSquare.formingMagicSquare(twoD);

        Assertions.assertEquals(4, result);
    }

}