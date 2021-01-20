package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class ClimbingTheLeaderBoardTest {

    @Test
    void deveRetornar431() {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);

        List<Integer> player = new ArrayList<>();
        player.add(70);
        player.add(80);
        player.add(105);

        List<Integer> result = ClimbingTheLeaderboard.climbingLeaderboard(ranked, player);

        Assertions.assertEquals(4, result.get(0));
        Assertions.assertEquals(3, result.get(1));
        Assertions.assertEquals(1, result.get(2));
    }

    @Test
    void deveRetornarRanking() {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        List<Integer> result = ClimbingTheLeaderboard.climbingLeaderboard(ranked, player);

        Assertions.assertEquals(6, result.get(0));
        Assertions.assertEquals(4, result.get(1));
        Assertions.assertEquals(2, result.get(2));
        Assertions.assertEquals(1, result.get(3));
    }


}