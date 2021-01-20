package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DayOfTheProgrammerTest {

    @Test
    void deveRetornar13Set2017() {

        String result = DayOfTheProgrammer.dayOfProgrammer(2017);

        Assertions.assertEquals("13.09.2017", result);
    }

    @Test
    void deveRetornar12Set2016() {

        String result = DayOfTheProgrammer.dayOfProgrammer(2016);

        Assertions.assertEquals("12.09.2016", result);
    }

}