package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BreakingTheRecordsTest {

    @Test
    void deveRetornar2MaxE4Min() {

        int[] scores = {10, 5,20,20,4,5,2,25,1};

        int[] result = BreakingTheRecords.breakingRecords(scores);

        Assertions.assertEquals(2, result[0]);
        Assertions.assertEquals(4, result[1]);
    }

    @Test
    void deveRetornar4MaxE0Min() {

        int[] scores = {3,4,21,36,10,28,35,5,24,42};

        int[] result = BreakingTheRecords.breakingRecords(scores);

        Assertions.assertEquals(4, result[0]);
        Assertions.assertEquals(0, result[1]);
    }
}