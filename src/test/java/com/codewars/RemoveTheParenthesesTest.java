package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codewars.RemoveTheParentheses.removeParentheses;

public class RemoveTheParenthesesTest {

    @Test
    public void receiveWithoutParenteses(){
        String word = "hello word";
        String withoutParentheses = removeParentheses(word);

        Assertions.assertEquals(word, withoutParentheses);
    }

    @Test
    public void receiveWithOneParenteses(){
        String word = "hello (hi) word";
        String withoutParentheses = removeParentheses(word);

        Assertions.assertEquals("hello word", withoutParentheses);
    }


//    @Test
//    public void basicTests() {
//        for (String[] trial : new String[][]{
//                {"example(unwanted thing)example", "exampleexample"},
//                {"example(unwanted thing)example", "exampleexample"},
//                {"example (unwanted thing) example", "example  example"},
//                {"a (bc d)e", "a e"},
//                {"a(b(c))", "a"},
//                {"hello example (words(more words) here) something", "hello example  something"},
//                {"(first group) (second group) (third group)", "  "}})
//            Tester.doTest(trial[0], trial[1]);
//    }
}
