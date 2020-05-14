package com.codewars;

import org.springframework.stereotype.Component;

//Given a number, return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.
//    Ex:
//        dashatize(274) -> '2-7-4'
//        dashatize(6815) -> '68-1-5'
@Component
public class DashatizeIt {
    public static String dashatize(int num) {
        return Integer.toString(num).replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceAll("^-", "").replaceAll("-$", "");
    }
}
