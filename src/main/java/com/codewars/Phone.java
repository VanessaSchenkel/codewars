package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    public static List<String> findComplement(List<String> phoneXfeatures, List<String> phoneYfeatures) {
        List<String> features = new ArrayList<>();

        Collections.sort(phoneXfeatures);
        Collections.sort(phoneYfeatures);

        for (int i = 0; i < phoneXfeatures.size(); i++) {
            for (int j = 0; j < phoneYfeatures.size(); j++) {
                if (!phoneXfeatures.contains(phoneYfeatures.get(j))) {
                    if (!features.contains(phoneYfeatures.get(j))) {
                        features.add(phoneYfeatures.get(j));

                    }
                }
            }
        }
        Collections.reverse(features);
        return features;
    }
}
