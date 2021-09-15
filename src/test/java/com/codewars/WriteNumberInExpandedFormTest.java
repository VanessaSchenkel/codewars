package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WriteNumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("1", WriteNumberInExpandedForm.expandedForm(1));
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
    }
}
