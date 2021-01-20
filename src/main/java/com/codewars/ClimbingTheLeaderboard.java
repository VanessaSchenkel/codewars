package com.codewars;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
//The player with the highest score is ranked number  on the leaderboard.
//Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
//
//Example
//        ranked = [100,90,90,80]
//        player = [70, 80, 105]
//        The ranked players will have ranks 1, 2, 2, and 3, respectively. If the player's scores are 70, 80 and 105, their rankings after each game are
//        4th, 3th and 1th. Return [4, 3, 1].
//
//        int ranked[n]: the leaderboard scores
//        int player[m]: the player's scores
//        Returns
//
//        int[m]: the player's rank after each new score


@Component
public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranking = new ArrayList<>(player.size());

        List<Integer> arrayWithNewScore = new ArrayList<>();
        arrayWithNewScore.addAll(ranked);

        for (int i = 0; i < player.size(); i++) {
            int play = player.get(i);
            ranked = ranked.stream()
                    .distinct()
                    .collect(Collectors.toList());

            for (int j = ranked.size() - 1; j > 0; j--) {
                if (play == ranked.get(j)){
                    ranked.add(j, play);
                    ranking.add(j+1);
                    break;
                }
                else if (play < ranked.get(j)) {
                        ranked.add(j+1, play);
                        ranking.add(j+2);
                        break;
                }  if (j == ranked.size()-1){
                    if (ranked.get(0) < play){
                        ranked.add(0, play);
                        ranking.add(1);
                        break;
                    }
                }
            }
        }

        return ranking;
    }

}

//public class Solution {
//
//    public static int binarySearch(int[] scores, int a) {
//        int left = 0;
//        int right = scores.length - 1;
//
//        while (left <= right) {
//            int m = (left + right) / 2;
//            if (scores[m] == a) {
//                return m;
//            } else if (scores[m] < a) {
//                right = m - 1;
//            } else {
//                left = m + 1;
//            }
//        }
//
//        return left;
//    }

//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] scores = new int[n];
//        for(int scores_i=0; scores_i < n; scores_i++){
//            scores[scores_i] = in.nextInt();
//        }
//        int m = in.nextInt();
//        int[] alice = new int[m];
//        for(int alice_i=0; alice_i < m; alice_i++){
//            alice[alice_i] = in.nextInt();
//        }
//
//        int[] ranks = new int[n];
//        ranks[0] = 1;
//        for (int i = 1; i < n; i++) {
//            if (scores[i] == scores[i - 1]) {
//                ranks[i] = ranks[i - 1];
//            } else {
//                ranks[i] = ranks[i - 1] + 1;
//            }
//        }
//
//        for (int j = 0; j < m; j++) {
//            int index = binarySearch(scores, alice[j]);
//            if (index == n) {
//                System.out.println(ranks[n - 1] + 1);
//            } else {
//                System.out.println(ranks[index]);
//            }
//        }
//    }
//}
