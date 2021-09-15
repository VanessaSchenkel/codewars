package com.codewars;

import org.springframework.stereotype.Component;

//You're not saying the names of the notes while you're doing this, but instead just counting each key press out loud
// (not starting again at 1 after 88, but continuing on to 89 and so forth) to try to keep a steady rhythm going and to
// see how far you can get before messing up. You move gracefully and with flourishes, and between screwups you hear,
// see, and feel that you are part of some great repeating progression between low and high notes and black and white keys.
//
//        Your Function
//        The function you are going to write is not actually going to help you with your piano playing, but just
//        explore one of the patterns you're experiencing: Given the number you stopped on, was it on a black key or a
//        white key? For example, in the description of your piano exercise above, if you stopped at 5, your left thumb
//        would be on the fifth key of the piano, which is black. Or if you stopped at 92, you would have gone all the
//        way from keys 1 to 88 and then wrapped around, so that you would be on the fourth key, which is white.
//
//        Your function will receive an integer between 1 and 10000 (maybe you think that in principle it would be cool
//        to count up to, say, a billion, but considering how many years it would take it is just not possible) and
//        return the string "black" or "white" -- here are a few more examples:
//
//        1     "white"
//        12    "black"
//        42    "white"
//        100   "black"
//        2017  "white"

@Component
public class PianoKataPart1 {
    public static String blackOrWhiteKey(int keyPressCount) {
        int[] arr = {1,3,4,6,8,9,11,13,15,16,18,20,21,23,25,27,28,30,32,33,35,37,39,40,
                42,44,45,47,49,51,52,54,56,57,59,61,63,64,66,68,69,71,73,75,76,78,
                80,81,83,85,87,88};

        for (int j : arr) {
            if (keyPressCount == j || ((keyPressCount - j) % 88) == 0) {
                return "white";
            }
        }
        return "black";

    }
}
