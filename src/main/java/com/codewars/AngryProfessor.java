package com.codewars;

import org.springframework.stereotype.Component;

//A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides
// to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time (arrival < 0) to arrived late (arrivel>0).
//Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.
//
//        Example
//        n = 5
//        k = 3
//        a = [2,1,0,1,2]
//        The first 3 students arrived on. The last 2 were late. The threshold is 3 students, so class will go on. Return YES.
@Component
public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int numberStudents = 0;
        String haveClass = "YES";

        for (int time : a) {
            if (time <= 0) {
                numberStudents++;
            }
        }
        if (numberStudents >= k) haveClass = "NO";

        return haveClass;

    }
}
