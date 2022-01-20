package com.codedifferently.labs.lab14a.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex01_NumberLoopsTest {

    @Test
    public void testGetEvenNumbers01() {
        // : Given
        String expected = "681012141618";
        int start = 5;
        int stop = 20;

        // : When
        String actual = Ex01_NumberLoops.getEvenNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEvenNumbers02() {
        // : Given
        String expected = "6810121416";
        int start = 5;
        int stop = 18;

        // : When
        String actual = Ex01_NumberLoops.getEvenNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetOddNumbers01() {
        // : Given
        String expected = "5791113151719";
        int start = 5;
        int stop = 20;

        // : When
        String actual = Ex01_NumberLoops.getOddNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetOddNumbers02() {
        // : Given
        String expected = "57911131517";
        int start = 5;
        int stop = 18;

        // : When
        String actual = Ex01_NumberLoops.getOddNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSquareNumbers01() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = Ex01_NumberLoops.getSquareNumbers(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSquareNumbers02() {
        // : Given
        String expected = "2564121196289400529676841102412251444168119362209";
        int start = 5;
        int stop = 50;
        int step = 3;

        // : When
        String actual = Ex01_NumberLoops.getSquareNumbers(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1A() {
        // : Given
        String expected = "0123456789";
        int stop = 11;

        // : When
        String actual = Ex01_NumberLoops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange2A() {
        // : Given
        String expected = "01234";
        int stop = 5;

        // : When
        String actual = Ex01_NumberLoops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange3A() {
        // : Given
        String expected = "012345678910111213141516171819";
        int stop = 20;

        // : When
        String actual = Ex01_NumberLoops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1B() {
        // : Given
        String expected = "5678910111213141516171819";
        int start = 5;
        int stop = 20;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2B() {
        // : Given
        String expected = "101112131415161718192021222324";
        int start = 10;
        int stop = 25;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3B() {
        // : Given
        String expected = "100101103104105106107108109";
        int start = 100;
        int stop = 110;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1C() {
        // : Given
        String expected = "51015";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2C() {
        // : Given
        String expected = "012345678910111213141516171819";
        int start = 0;
        int stop = 20;
        int step = 1;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3C() {
        // : Given
        String expected = "0246810";
        int start = 0;
        int stop = 11;
        int step = 2;

        // : When
        String actual = Ex01_NumberLoops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetExponentiationNumbers01() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;
        int exponent = 2;

        // : When
        String actual = Ex01_NumberLoops.getExponentiations(start, stop, step, exponent);

        Assertions.assertEquals(expected, actual);
    }
}
