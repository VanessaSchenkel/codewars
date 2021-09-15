package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestScoringWordTest {
    @Test
    public void basic() {
        assertEquals("aa", HighestScoringWord.high("aa"));
        assertEquals("aa", HighestScoringWord.high("AA"));
        assertEquals("aa", HighestScoringWord.high("aa b"));
        assertEquals("c", HighestScoringWord.high("aa c"));
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", HighestScoringWord.high("aa b"));
        assertEquals("b", HighestScoringWord.high("b aa"));
        assertEquals("bb", HighestScoringWord.high("bb d"));
        assertEquals("d", HighestScoringWord.high("d bb"));
        assertEquals("aaa", HighestScoringWord.high("aaa b"));
    }
}
