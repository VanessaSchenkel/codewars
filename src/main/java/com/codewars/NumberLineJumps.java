package com.codewars;

import org.springframework.stereotype.Component;

//You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
//The first kangaroo starts at location x1  and moves at a v1 rate of  meters per jump.
//The second kangaroo starts at location x2 and moves at a v2 rate of  meters per jump.
//You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
//For example, kangaroo 1 starts at x1=2 with a jump distance v1=1 and kangaroo 2 starts at x2=1 with a jump distance of v2=2. After one jump, they are both at x=3, (x1+v1 = 2+1,x2+v2+2+1 ),
// so our answer is YES.

@Component
public class NumberLineJumps {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x1 > x2) && (v1 > v2)) return "NO";
        else if ((x1 < x2) && (v1 < v2)) return "NO";
        else if ((v1 == v2) && (x1 != x2)) return "NO";
        else if ((x2 - x1) % (v1 - v2) == 0 || (x2 - x1) % (v2 - v1) == 0) return "YES";
        else return "NO";
    }
}
