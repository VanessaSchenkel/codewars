package com.codewars;

import org.springframework.stereotype.Component;

@Component
public class SortingComparator {
}

//    Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.
//    The Player class is provided in the editor below. It has two fields:
//
//        : a string.
//        : an integer.

//    Sample Input
//
//        5
//        amy 100
//        david 100
//        heraldo 50
//        aakansha 75
//        aleksa 150
//        Sample Output
//
//        aleksa 150
//        amy 100
//        david 100
//        aakansha 75
//        heraldo 50

/*---------*/
//class Checker implements Comparator<Player> {
//    public int compare(Player a, Player b){                                                                                                                 if(a.score>b.score) return -1;
//    else if(a.score<b.score) return 1;
//    else return a.name.compareTo(b.name);
//    }
//}
