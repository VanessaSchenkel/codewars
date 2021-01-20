package com.codewars;

import org.springframework.stereotype.Component;

//When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently.

@Component
public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        char[] ch = word.toCharArray();
        int n = ch.length;
        int max = 0;
        for (char c : ch) {
            int k = (int) c - 97;
            if (max < h[k])
                max = h[k];
        }
        return max * n;
    }
}
