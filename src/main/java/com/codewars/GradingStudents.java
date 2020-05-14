package com.codewars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//HackerLand University has the following grading policy:
//Every student receives a grade in the inclusive range from 0 to 100.
//Any grade less than 40 is a failing grade.
//Function Description
//Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.
//gradingStudents has the following parameter(s):
//grades: an array of integers representing grades before rounding
//Sam is a professor at the university and likes to round each student's grade according to these rules:
//        If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next 5 multiple of .
//        If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
//        For example, 84 will be rounded to 85 but 29 will not be rounded because the rounding would result in a number
//        that is less than 40.
//        Sample Input 0
//        73
//        67
//        38
//        33
//        Sample Output 0
//        75
//        67
//        40
//        33

@Component
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> listRounded = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 38) listRounded.add(grade);
            else if ((grade + 2) % 5 == 0) {
                grade += 2;
                listRounded.add(grade);
            } else if ((grade + 1) % 5 == 0) {
                grade += 1;
                listRounded.add(grade);
            } else if (grade >= 40)
                listRounded.add(grade);

        }

        return listRounded;
    }
}
