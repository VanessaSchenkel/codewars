package com.codewars;

import org.springframework.stereotype.Component;

import java.util.*;

//Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting.
// He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica
// of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine.
// He cannot use substrings or concatenation to create the words he needs.
//Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly
// using whole words from the magazine; otherwise, print No.
//checkMagazine has the following parameters:
//
//        magazine: an array of strings, each a word in the magazine
//        note: an array of strings, each a word in the ransom note
@Component
public class HashTablesRansomNote {
    static String checkMagazine(String[] magazine, String[] note) {
        if (magazine.length == 0 || note.length == 0) return "No";

        Arrays.sort(magazine);
        Arrays.sort(note);

        List<String> magazineWords = new ArrayList<>(Arrays.asList(magazine));

        for (String w : note){
            if(!magazineWords.remove(w)){
//                System.out.println("No");
//                return;
                return "No";
            }
        }
        //System.out.println("Yes");
        return "Yes";

    }
}
