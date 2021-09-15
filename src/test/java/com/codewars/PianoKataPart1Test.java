package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PianoKataPart1Test {
    @Test
    public void ExampleTests() {
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(1));
        Assert.assertEquals("black", PianoKataPart1.blackOrWhiteKey(5));
        Assert.assertEquals("black", PianoKataPart1.blackOrWhiteKey(12));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(42));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(88));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(89));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(92));
        Assert.assertEquals("black", PianoKataPart1.blackOrWhiteKey(100));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(111));
        Assert.assertEquals("black", PianoKataPart1.blackOrWhiteKey(200));
        Assert.assertEquals("white", PianoKataPart1.blackOrWhiteKey(2017));
    }
}
