package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void deveRetornarSeteRecebendoAba() throws Exception {
        String s = "aba";
        long times = 10L;
        long result = RepeatedString.repeatedString(s, times);
        Assert.assertEquals(7L, result);
    }

    @Test
    public void deveRetornarUmMilhaoRecebendoSoA() throws Exception {
        String s = "a";
        long times = 1000000000000L;
        long result = RepeatedString.repeatedString(s, times);
        Assert.assertEquals(1000000000000L, result);
    }

    @Test
    public void deveRetornarNumeroAbsurdo() throws Exception {
        String s = "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";
        long times = 685118368975L;
        long result = RepeatedString.repeatedString(s, times);
        Assert.assertEquals(41107102139L, result);
    }
}


