package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are
// a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend,
// and he wants to maximize the number of toys he buys with this money. Given a list of toy prices and an amount to spend,
// determine the maximum number of gifts he can buy.
//Example
//        prices = [1,2,3,4]
//        k=7
//        The budget is 7 units of currency. He can buy items that cost [1,2,3] for 6, or [3,4] for 7 units. The maximum is 3 items.
@Component
public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        int maxItens = 0;
        int totalPrice = 0;
        List<Integer> pricesList = Arrays.stream(prices).boxed().collect(Collectors.toList());
        Collections.sort(pricesList);

        for (int i = 0; i < pricesList.size(); i++) {
            if (totalPrice + pricesList.get(i) <= k){
                totalPrice += pricesList.get(i);
                maxItens++;
            } if (totalPrice == k){
                return maxItens;
            }
        }

        return maxItens;
    }
}
