package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentsTest {

    @Test
    public void testGradingStudents() throws Exception {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(75);
        expectedResult.add(67);
        expectedResult.add(40);
        expectedResult.add(33);

        List<Integer> result = GradingStudents.gradingStudents(grades);
        Assert.assertEquals(expectedResult, result);
    }
}
