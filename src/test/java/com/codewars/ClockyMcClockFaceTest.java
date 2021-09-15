package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockyMcClockFaceTest {
    @Test
    public void test1200() {
        assertEquals("12:00", ClockyMcClockFace.whatTimeIsIt(0));
        assertEquals("12:00", ClockyMcClockFace.whatTimeIsIt(360));
    }

    @Test
    public void test1320() {
        assertEquals("01:20", ClockyMcClockFace.whatTimeIsIt(80));
    }

    @Test
    public void test0300() {
        assertEquals("03:00", ClockyMcClockFace.whatTimeIsIt(90));
    }

    @Test
    public void test0600() {
        assertEquals("06:00", ClockyMcClockFace.whatTimeIsIt(180));
    }

    @Test
    public void test0900() {
        assertEquals("09:00", ClockyMcClockFace.whatTimeIsIt(270));
    }

    @Test
    public void test0922() {
        assertEquals("09:22", ClockyMcClockFace.whatTimeIsIt(281.485));
    }
}
