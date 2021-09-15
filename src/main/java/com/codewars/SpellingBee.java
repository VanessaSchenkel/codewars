package com.codewars;


//How many bees are in the beehive?
//        bees can be facing UP, DOWN, LEFT, or RIGHT
//        bees can share parts of other bees
//        Examples
//        Ex1
//
//        bee.bee
//        .e..e..
//        .b..eeb
//        Answer: 5
//
//        Ex2
//
//        bee.bee
//        e.e.e.e
//        eeb.eeb
public class SpellingBee {

    public static int howManyBees(final char[][] hive) {
        if (hive == null) return 0;

        int bees = 0;

        for (int i = 0; i < hive.length; i++) {
            for (int j = 0; j < hive[i].length; j++) {
                if (hive[i][j] == 'b') {
                    if (i - 2 >= 0 && hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e') bees++;
                    if (i + 2 < hive.length && hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e') bees++;
                    if (j - 2 >= 0 && hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e') bees++;
                    if (j + 2 < hive[i].length && hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e') bees++;

                }
            }
        }
        return bees;
    }


}
