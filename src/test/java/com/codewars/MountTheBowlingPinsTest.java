package com.codewars;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountTheBowlingPinsTest {
    @Test
    public void exampleTests()
    {
        MountTheBowlingPins bowling = new MountTheBowlingPins();
        int[] testArray = new int[]{1,2,3};
        assertEquals("I I I I\n I I I \n       \n       ", bowling.bowlingPins(testArray));

        testArray = new int[]{3,5,9};
        assertEquals("I I   I\n I   I \n  I    \n   I   ", bowling.bowlingPins(testArray));
    }
}
