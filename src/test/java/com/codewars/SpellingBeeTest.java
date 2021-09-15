package com.codewars;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpellingBeeTest {

    @Test
    public void basic() {
        final char hive[][] = new char[][] {
                "bee".toCharArray(),
        };
        assertEquals(1, SpellingBee.howManyBees(show(hive)));
    }

    @Test
    public void basic2() {
        final char hive[][] = new char[][] {
                "bee.".toCharArray(),
        };
        assertEquals(1, SpellingBee.howManyBees(show(hive)));
    }
    @Test
    public void basic3() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
        };
        assertEquals(2, SpellingBee.howManyBees(show(hive)));
    }

    @Test
    public void basic4() {
        final char hive[][] = new char[][] {
                "eeb".toCharArray(),
                "bee.bee".toCharArray()
        };
        assertEquals(3, SpellingBee.howManyBees(show(hive)));
    }



    private static char [][] show(final char [][] hive) {
        for (int y = 0; y < hive.length; y++) {
            System.out.println(hive[y]);
        }
        return hive;
    }

    @Test
    public void ex1() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                ".e..e..".toCharArray(),
                ".b..eeb".toCharArray()
        };
        assertEquals(5, SpellingBee.howManyBees(show(hive)));
    }

    @Test
    public void ex2() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                "e.e.e.e".toCharArray(),
                "eeb.eeb".toCharArray()
        };
        assertEquals(8, SpellingBee.howManyBees(show(hive)));
    }
}
