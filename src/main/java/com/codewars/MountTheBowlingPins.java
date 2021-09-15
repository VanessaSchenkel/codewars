package com.codewars;

//Task:
//        Did you ever play Bowling? Short: You have to throw a bowl into 10 Pins arranged like this:
//
//
//        I I I I  # each Pin has a Number:    7 8 9 10
//        I I I                                4 5 6
//        I I                                  2 3
//        I                                    1
//
//        You will get an Array with Numbers, e.g.: [3,5,9] and remove them from the field like this:
//
//
//        I I   I
//        I   I
//        I
//        I
//
//        Return a string with the current field.
//
//        Note that:
//        String.prototype.replace() is not allowed!
//
//        You begin a new line with \n
//        Each Line must be 7 chars long
//        Fill the missing pins with a whitespace

public class MountTheBowlingPins {
    public String bowlingPins(int[] arr) {
        StringBuilder pins = new StringBuilder("I I I I\n I I I \n  I I  \n   I   ");

        for (int n : arr) {
            switch (n) {
                case 1:
                    pins.setCharAt(27, ' ');
                    break;
                case 2:
                    pins.setCharAt(18, ' ');
                    break;
                case 3:
                    pins.setCharAt(20, ' ');
                    break;
                case 4:
                    pins.setCharAt(9, ' ');
                    break;
                case 5:
                    pins.setCharAt(1, ' ');
                    break;
                case 6:
                    pins.setCharAt(13, ' ');
                    break;
                case 7:
                    pins.setCharAt(0, ' ');
                    break;
                case 8:
                    pins.setCharAt(2, ' ');
                    break;
                case 9:
                    pins.setCharAt(4, ' ');
                    break;
                case 10:
                    pins.setCharAt(6, ' ');
                    break;


            }
        }


        return pins.toString();
    }
}
