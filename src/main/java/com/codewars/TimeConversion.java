package com.codewars;

import org.springframework.stereotype.Component;

//Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock,
//and 12:00:00 on a 24-hour clock.
//Function Description
//Complete the timeConversion function in the editor below. It should return a new string representing the input time in
//24 hour format.
//        timeConversion has the following parameter(s):
//        s: a string representing time in  hour format
//Sample Input 0
//07:05:45PM
//Sample Output 0
//19:05:45

@Component
public class TimeConversion {
    static String timeConversion(String s) {
        String[] split = s.split(":");
        String seconds = "";

        if (s.charAt(8) == 'A') {
            seconds = split[2].replace("AM", "");
            if (split[0].equals("12")) return "00:" + split[1] + ":" + seconds;
            return split[0] + ":" + split[1] + ":" + seconds;
        }

        seconds = split[2].replace("PM", "");
        int value = Integer.parseInt(split[0]);

        if (value == 12) {
            return "12:" + split[1] + ":" + seconds;
        }

        value += 12;
        return value + ":" + split[1] + ":" + seconds;
    }
}
