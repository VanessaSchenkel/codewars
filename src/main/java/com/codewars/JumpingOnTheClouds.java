package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads
// and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current
// cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump
// from her starting position to the last cloud. It is always possible to win the game.
//
// For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
//
// Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
//
// jumpingOnClouds has the following parameter(s):
// c: an array of binary integers
// Input Format
// The first line contains an integer , the total number of clouds. The second line contains  space-separated binary
// integers describing clouds  where .
// Output Format
// Print the minimum number of jumps needed to win the game.

@Component
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        List<Integer> list = Arrays.stream(c).boxed().collect(Collectors.toList());

        while (i < c.length - 2) {
            if (list.get(i) == 0 && list.get(i + 2) == 0) {
                i += 2;
                jumps++;
            } else if (list.get(i + 2) == 1) {
                i++;
                jumps++;
            }
        }

        if (i == c.length - 2 && c[i] == 0) {
            jumps++;
        }

        return jumps;
    }


}
