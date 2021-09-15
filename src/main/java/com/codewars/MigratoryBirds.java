package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//You have been asked to help study the population of birds migrating across the continent. Each type of bird you are
//interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will
//be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list
//of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common,
//choose the type with the smallest ID number.
//
//For example, assume your bird sightings are of types arr=[1,1,2,2,3]. There are two each of types 1 and 2, and one sighting of type 3.
//Pick the lower of the two types seen twice: type 1.

@Component
public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
//        int typeOfBird = 0;
//        int max = 0;
//
//        for (int i = 0; i < arr.size(); i++) {
//            int sameBird = 0;
//            for (int j = 0; j < arr.size(); j++) {
//                if (arr.get(i).equals(arr.get(j))){
//                    sameBird++;
//                }
//            }
//            if (sameBird > max){
//                max = sameBird;
//                typeOfBird = arr.get(i);
//            }
//        }
//        return typeOfBird;
        List<Integer> types = new ArrayList<>();
        types.add(Collections.frequency(arr, 1));
        types.add(Collections.frequency(arr, 2));
        types.add(Collections.frequency(arr, 3));
        types.add(Collections.frequency(arr, 4));
        types.add(Collections.frequency(arr, 5));

        int max = Collections.max(types);

        if (max == types.get(0))
            return 1;
        else if (max == types.get(1))
            return 2;
        else if (max == types.get(2))
            return 3;
        else if (max == types.get(3))
            return 4;
        else return 5;


    }
}
