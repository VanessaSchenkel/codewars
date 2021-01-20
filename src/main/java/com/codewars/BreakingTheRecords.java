package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;

//Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
// She tabulates the number of times she breaks her season record for most points and least points in a game.
// Points scored in the first game establish her record for the season, and she begins counting from there.
//For example, assume her scores for the season are represented in the array scores=[12,24,10,24] .
// Scores are in the same order as the games played. She would tabulate her results as follows:

//          Game  Score  Minimum  Maximum   Min Max
//          0      12     12       12       0   0
//          1      24     12       24       0   1
//          2      10     10       24       1   1
//          3      24     10       24       1   1

//Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.

//Complete the breakingRecords function in the editor below. It must return an integer array containing the numbers of times she broke her records.
//Index 0 is for breaking most points records, and index 1 is for breaking least points records.

@Component
public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int[] results = new int[2];
        int countMax = 0;
        int countMin = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]){
                max = scores[i];
                countMax++;
            }
            if (scores[i] < min){
                min = scores[i];
                countMin++;
            }
        }
        results[0] = countMax;
        results[1] = countMin;

        return results;

    }
}
