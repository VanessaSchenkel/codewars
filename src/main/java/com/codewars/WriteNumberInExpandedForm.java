package com.codewars;

//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        StringBuilder numAsString = new StringBuilder();
        numAsString.append(num);

        StringBuilder expanded = new StringBuilder();
        int totalZeros = numAsString.length() - 2;

        for (int i = 0; i < numAsString.length(); i++) {
            if (numAsString.charAt(i) != '0') {
                expanded.append(numAsString.charAt(i));
                int control = totalZeros - i;

                while (control >= 0) {
                    expanded.append("0");
                    control--;
                }
                expanded.append(" + ");
            }
        }

        expanded.deleteCharAt(expanded.lastIndexOf("+"));

        return expanded.toString().trim();
    }
}
