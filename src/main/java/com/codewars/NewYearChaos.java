package com.codewars;

import org.springframework.stereotype.Component;

//It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating
// their initial position in the queue. Initial positions increment by 1 from 1 at the front of the line to n at the back.
//Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions,
// they still wear the same sticker denoting their original places in line. One person can bribe at most two others.
// For example, if person5 and person4 bribes , the queue will look like this: [1,2,3,5,4,6,7,8].
//Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the
// queue into its current state. If anyone has bribed more than two people, the line is too chaotic to compute the answer.

@Component
public class NewYearChaos {
    static String minimumBribes(int[] q) {
        int count = 0;
        // always keep track of min three values observed
        // Compare currently seeing value with this three values.
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree = Integer.MAX_VALUE;
        int minOfThree = Integer.MAX_VALUE;

        // iterating from left to right
        for (int i = q.length - 1; i >= 0; i--) {
            // person has no way to move more than two positions -> wrong
            if ((q[i] - i) > 3) {
//                System.out.println("Too chaotic");
//                return;
                return "Too chaotic";
            } else {
                // means current value has passed at least 3 values -> wrong
                if (q[i] > maxOfThree) {
//                    System.out.println("Too chaotic");
//                    return;
                    return "Too chaotic";
                } else if (q[i] > midOfThree) { // means -> current value has bribed 2 ppl
                    count = count + 2;
                } else if (q[i] > minOfThree) { // means-> current value has bribed 1 person.
                    count = count + 1;
                }

                // Now adjust minThree values comparing, taking the current value to account
                if (q[i] < minOfThree) {
                    maxOfThree = midOfThree;
                    midOfThree = minOfThree;
                    minOfThree = q[i];
                } else if (q[i] < midOfThree) {
                    maxOfThree = midOfThree;
                    midOfThree = q[i];
                } else if (q[i] < maxOfThree) {
                    maxOfThree = q[i];
                }
            }
        }
        //System.out.println(count);
        return "Swaps: " + count;
    }
}
