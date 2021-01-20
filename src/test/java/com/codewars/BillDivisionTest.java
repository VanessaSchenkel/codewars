package com.codewars;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


class BillDivisionTest {


    @Test
    void deveRetornar5() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        String result = BillDivision.bonAppetit(bill, 1,12);

        Assert.assertEquals("Valor: 5", result);
    }

    @Test
    void deveRetornarBonAppetit() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        String result = BillDivision.bonAppetit(bill, 1,7);

        Assert.assertEquals("Bon Appetit", result);
    }

}