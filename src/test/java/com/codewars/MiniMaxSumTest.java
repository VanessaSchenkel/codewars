package com.codewars;

import org.junit.Test;

public class MiniMaxSumTest {

    @Test
    public void deveImprimir10e14() throws Exception {
        //esperado: 10 14
        int[] arr = {1,2,3,4,5};
        MiniMaxSum.miniMaxSum(arr);
    }

    @Test
    public void deveImprimir2063136757e2744467344() throws Exception {
        //esperado: 2063136757 2744467344
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        MiniMaxSum.miniMaxSum(arr);
    }

    @Test
    public void deveImprimir20e20() throws Exception {
        //esperado: 20 20
        int[] arr = {5, 5, 5, 5, 5};
        MiniMaxSum.miniMaxSum(arr);
    }
}
