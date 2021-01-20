package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the
// characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum
// jump height by 1 unit for each dose. How many doses of the potion must the character take to be able to jump all of the
// hurdles. If the character can already clear all of the hurdles, return 0.
//Example
//        height = [1, 2, 3, 3, 2]
//        k = 1
//        The character can jump 1 unit high initially and must take 3 - 1 = 2 doses of potion to be able to jump all of the hurdles.

@Component
public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        List<Integer> heights = Arrays.stream(height).boxed().collect(Collectors.toList());
        Collections.sort(heights);

        if (k >= heights.get(heights.size()-1)) return 0;

        return heights.get(heights.size()-1) - k;

    }
}
