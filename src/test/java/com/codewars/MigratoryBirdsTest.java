package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class MigratoryBirdsTest {

    @Test
    void deveRetornar4() {
        List<Integer> birds = new ArrayList<>();
        birds.add(1);
        birds.add(4);
        birds.add(4);
        birds.add(4);
        birds.add(5);
        birds.add(3);

        int result = MigratoryBirds.migratoryBirds(birds);

        Assertions.assertEquals(4, result);
    }

    @Test
    void deveRetornar3() {
        List<Integer> birds = new ArrayList<>();
        birds.add(1);
        birds.add(2);
        birds.add(3);
        birds.add(4);
        birds.add(5);
        birds.add(4);
        birds.add(3);
        birds.add(2);
        birds.add(1);
        birds.add(3);
        birds.add(4);

        int result = MigratoryBirds.migratoryBirds(birds);

        Assertions.assertEquals(3, result);
    }
}