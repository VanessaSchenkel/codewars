package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//You will be given a list of 32 bit unsigned integers. Flip all the bits ( 1 -> 0 and 0 -> 1 ) and print the result as an unsigned integer.

@Component
public class FlippingBits {
    static long flippingBits(long n) {
        //Using ~ that is unary bitwise complement = just flip bits
        long unsignedNumber = ~n;
        //Using Bitwise AND 0xffffffffL to mask off those bits and
        //convert signed int to unsigned
        return unsignedNumber & 0xffffffffL;

    }
}
