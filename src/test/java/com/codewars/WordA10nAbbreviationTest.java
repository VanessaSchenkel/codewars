package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordA10nAbbreviationTest {

    @Test
    public void basic() {
        assertEquals("van", WordA10nAbbreviation.abbreviate("van"));
        assertEquals("van van", WordA10nAbbreviation.abbreviate("van van"));
        assertEquals("v2e", WordA10nAbbreviation.abbreviate("vane"));
        assertEquals("v2e van", WordA10nAbbreviation.abbreviate("vane van"));
        assertEquals("v2e-van", WordA10nAbbreviation.abbreviate("vane-van"));
        assertEquals("v2e-van v5a oi", WordA10nAbbreviation.abbreviate("vane-van vanessa oi"));
        assertEquals("on-sat. is on_b5n; on; a_sat: on", WordA10nAbbreviation.abbreviate("on-sat. is on_balloon; on; a_sat: on"));

//        Input: 'on-sat. is on_balloon; on; a_sat: on'
//    expected:<on[-sat. is on_b5n; on; a_sat]: on> but was:<on[ s2. is o9; on; a4]: on>
    }

    @Test
    public void testInternationalization() {
        assertEquals("i18n", WordA10nAbbreviation.abbreviate("internationalization"));
    }
}
