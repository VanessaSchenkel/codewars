package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class TimeConversionTest {

    @Test
    public void deveImprimir19QuandoFor07AM() throws Exception {
        String result = TimeConversion.timeConversion("07:05:45PM");
        Assert.assertEquals("19:05:45", result);
    }

    @Test
    public void deveImprimir07QuandoFor07AM() throws Exception {
        String result = TimeConversion.timeConversion("07:05:45AM");
        Assert.assertEquals("07:05:45", result);
    }

    @Test
    public void deveImprimir12QuandoForMeioDia() throws Exception {
        String result = TimeConversion.timeConversion("12:00:00PM");
        Assert.assertEquals("12:00:00", result);
    }

    @Test
    public void deveImprimir00QuandoForMeiaNoite() throws Exception {
        String result = TimeConversion.timeConversion("12:00:00AM");
        Assert.assertEquals("00:00:00", result);
    }
}
