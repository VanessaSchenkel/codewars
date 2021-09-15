package com.codewars;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//In this kata you are given a string for example:
//
//        "example(unwanted thing)example"
//        Your task is to remove everything inside the parentheses as well as the parentheses themselves.
//
//        The example above would return:
//
//        "exampleexample"
//        Notes
//        Other than parentheses only letters and spaces can occur in the string. Don't worry about other brackets like
//        "[]" and "{}" as these will never appear.
//        There can be multiple parentheses.
//        The parentheses can be nested.

@Component
public class RemoveTheParentheses {
    public static String removeParentheses(final String str) {
        String updated = str.replaceAll("\\([^()]*\\)", "");
        if (updated.contains("(")) updated = removeParentheses(updated);
        return updated;
    }
}
