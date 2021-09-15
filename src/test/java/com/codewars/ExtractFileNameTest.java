package com.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ExtractFileNameTest {

    @Test
    public void testSample() {

        Assert.assertEquals("name", ExtractFileName.extractFileName("name"));
        Assert.assertEquals("name", ExtractFileName.extractFileName("1234_name"));
        Assert.assertEquals("name1", ExtractFileName.extractFileName("1234_name1"));
        Assert.assertEquals("name.jpeg", ExtractFileName.extractFileName("1234_name.jpeg"));
        Assert.assertEquals("name.jpeg", ExtractFileName.extractFileName("1234_name.jpeg.hsaiud"));
//        Assert.assertEquals("name.jpeg", ExtractFileName.extractFileName("1234_name.jpeg.dsjfido"));

//        Assert.assertEquals(
//                "FILE_NAME.EXTENSION",
//                ExtractFileName.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
//        );
//        Assert.assertEquals(
//                "FILE_NAME.EXTENSION",
//                ExtractFileName.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
//        );
    }
}
