package com.codewars;
//Due to lack of maintenance the minute-hand has fallen off Town Hall clock face.
//
//        And because the local council has lost most of our tax money to a Nigerian email scam there are no funds to fix the clock properly.
//
//        Instead, they are asking for volunteer programmers to write some code that tell the time by only looking at the remaining hour-hand!
//
//        What a bunch of cheapskates!
//
//        Can you do it?
//
//        Kata
//        Given the angle (in degrees) of the hour-hand, return the time in HH:MM format. Round down to the nearest minute.
//
//        Examples
//        12:00 = 0 degrees
//        03:00 = 90 degrees
//        06:00 = 180 degrees
//        09:00 = 270 degrees
//        12:00 = 360 degrees
//        Notes
//        0 <= angle <= 360

//The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute) and hour hand moves 360 degrees in 12 hours
// (or 0.5 degrees in 1 minute). In h hours and m minutes, the minute hand would move (h*60 + m)*6 and hour hand
// would move (h*60 + m)*0.5.

public class ClockyMcClockFace {
    public static String whatTimeIsIt(final double angle) {
        double mins = angle * 2;
        double hour = Math.floor(mins / 60);
        double minute = Math.floor(mins % 60);

        String hourFormatted = String.valueOf((int) hour);
        String minuteFormatted = String.valueOf((int) minute);

        if (hour == 0) {
            hourFormatted = String.valueOf(12);
        } else if (hour < 10) {
            hourFormatted = "0" + (int) hour;
        }

        if (minute < 10) {
            minuteFormatted = "0" + (int) minute;
        }

        return hourFormatted + ":" + minuteFormatted;
    }

}

    //MELHOR SOLUCAO
//    int m = (int) (angle % 30 * 2),
//            h = (int) (angle / 30);
//    if(h==0)h=12;
//            return String.format("%02d:%02d",h,m);
//            }