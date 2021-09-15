package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PossibilitiesOfThrowingACoinNtimesTest {
    @Test
    public void BasicTests() throws Exception {
        PossibilitiesOfThrowingACoinNtimes c = new  PossibilitiesOfThrowingACoinNtimes();

        assertEquals(new Object[] {"H","T"}, (Object[])c.coin(1));
        assertEquals(new Object[] {"HH","HT","TH","TT"}, (Object[])c.coin(2));
        assertEquals(new Object[] {"HHH","HHT","HTH","HTT","THH","THT","TTH","TTT"}, (Object[])c.coin(3));
    }
}
