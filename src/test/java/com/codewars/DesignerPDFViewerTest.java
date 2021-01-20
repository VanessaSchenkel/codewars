package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DesignerPDFViewerTest {

    @Test
    public void deveRetornar9() throws Exception {
        int[] arr = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

        int result = DesignerPDFViewer.designerPdfViewer(arr, "abc");
        Assert.assertEquals(9, result);
    }

    @Test
    public void deveRetornar28() throws Exception {
        int[] arr = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};

        int result = DesignerPDFViewer.designerPdfViewer(arr, "zaba");
        Assert.assertEquals(28, result);
    }

}