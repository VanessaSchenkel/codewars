package com.codewars;

import org.springframework.stereotype.Component;

//A teacher asks the class to open their books to a page number. A student can either start turning pages from the front
// of the book or from the back of the book. They always turn pages one at a time.
// When they open the book, page  is always on the right side.
//When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides.
// The last page may only be printed on the front, given the length of the book. If the book is n pages long, and a student
// wants to turn to page p, what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
//Complete the pageCount function in the editor below.
//pageCount has the following parameter(s):
//        int n: the number of pages in the book
//        int p: the page number to turn to
//        Returns
//        int: the minimum number of pages to turn
@Component
public class DrawingBook {

    static int pageCount(int n, int p) {

        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

//        int numberOfFlips = 0;
//        if (n == p || p == 1) return 0;
//        else if (p == 2 || p == 3) return 1;
//        else if (n % 2 != 0 && n - 1 == p) return 0;
//
//        else if (p < n / 2) {
//            for (int i = 0; i < p-1; i += 2) {
//                numberOfFlips++;
//            }
//        } else {
//            for (int i = n; i > p; i -=2) {
//                numberOfFlips++;
//            }
//        }
//
//        return numberOfFlips;

    }
}
