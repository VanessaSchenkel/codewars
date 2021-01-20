package com.codewars;

import org.springframework.stereotype.Component;

//Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests.
// Initially, her luck balance is 0. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers, L and T:
// L is the amount of luck associated with a contest. If Lena wins the contest, her luck balance will decrease by L; if she loses it, her luck balance will increase by L.
// T denotes the contest's importance rating. It's equal to 1 if the contest is important, and it's equal to 0 if it's unimportant.
//If Lena loses no more than k important contests, what is the maximum amount of luck she can have after competing in all
// the preliminary contests? This value may be negative.
//Example
//        k = 2
//        L = [5, 1, 4]
//        T = [1, 2, 0]
//        Contest		L[i]	T[i]
//            1		5	    1
//            2		1	    1
//            3		4	    0
//        If Lena loses all of the contests, her will be 5 + 1 + 4 = 10. Since she is allowed to lose 2 important contests,
//        and there are only 2 important contests, she can lose all three contests to maximize her luck at 10.
//        If k=1, she has to win at least 1 of the 2 important contests. She would choose to win the lowest value important
//        contest worth 1. Her final luck will be 5 + 4 - 1 = 8.

@Component
public class LuckBalance {
//    static int luckBalance(int k, int[][] contests) {
//        int luck = 0;
//
//        for (int i = 0; i < contests.length; i++) {
//            for (int j = 0; j < contests[i].length; j++) {
//                if (contests[i][j] == 0){
//                    luck += contests[i];
//                }
//            }
//        }
//
//
//        return luck;
//    }

}

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        ///////Variables//////
//        int n = input.nextInt();
//        int k = input.nextInt();
//        int maxLuck = 0;
//        ArrayList<Integer> importantContests = new ArrayList<>();
//        //////////////////////
//
//        //Build list of important contests
//        for(int i = 0; i < n; i++){
//            int luck = input.nextInt();
//            int important = input.nextInt();
//
//            if(important != 1)
//            {
//                maxLuck += luck;
//            }
//
//            else
//                importantContests.add(luck);
//        }
//
//        //Sort the important contests in descending order
//        Collections.sort(importantContests, Collections.reverseOrder());
//
//        //Lose the k largest contests and win the rest
//        for(int i = 0; i < importantContests.size(); i++){
//            if(i < k)
//                maxLuck += importantContests.get(i);
//            else
//                maxLuck -= importantContests.get(i);
//        }
//
//        System.out.println(maxLuck);
//    }
//}