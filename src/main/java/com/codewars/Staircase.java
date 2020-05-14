package com.codewars;

import org.springframework.stereotype.Component;

//Consider a staircase of size :
//        #
//        ##
//        ###
//        ####
//Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is
//not preceded by any spaces. Write a program that prints a staircase of size n.
//        Sample Input
//        6
//        Sample Output
//        #
//        ##
//        ###
//        ####
//        #####
//        ######

@Component
public class Staircase {

    static void staircase(int n) {
        StringBuilder sr = new StringBuilder();
        int space = n - 1;
        int hashtag = 1;

        while (space >= 0) {
            sr.append(" ".repeat(space));
            sr.append("#".repeat(hashtag));
            sr.append("\n");
            hashtag++;
            space--;
        }
        System.out.println(sr);
    }

}

