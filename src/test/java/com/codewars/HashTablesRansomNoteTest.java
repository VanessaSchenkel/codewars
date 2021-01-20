package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class HashTablesRansomNoteTest {


    @Test
    void deveRetornarYes() {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        String result = HashTablesRansomNote.checkMagazine(magazine, note);

        Assert.assertEquals("Yes", result);
    }

    @Test
    void deveRetornarNo() {
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};

        String result = HashTablesRansomNote.checkMagazine(magazine, note);

        Assert.assertEquals("No", result);
    }
}