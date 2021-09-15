package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EaseTheStockBrokerTest {

    @Test
    public void basic(){
        assertEquals("Buy: 0 Sell: 0", EaseTheStockBroker.balanceStatements(""));
        assertEquals("Buy: 162600 Sell: 0", EaseTheStockBroker.balanceStatements("GOOG 300 542.0 B"));
    }

    @Test
    public void test1() {
        String l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
        assertEquals("Buy: 29499 Sell: 0",
                EaseTheStockBroker.balanceStatements(l));
    }
    @Test
    public void test2() {
        String l = "GOOG 90 160.45 B, JPMC 67 12.8 S, MYSPACE 24.0 210 B, CITI 50 450 B, CSCO 100 55.5 S";
        assertEquals("Buy: 14440 Sell: 6408; Badly formed 2: MYSPACE 24.0 210 B ;CITI 50 450 B ;",
                EaseTheStockBroker.balanceStatements(l));
    }
}
