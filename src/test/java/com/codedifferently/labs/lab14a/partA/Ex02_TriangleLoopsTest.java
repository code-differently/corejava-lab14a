package com.codedifferently.labs.lab14a.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex02_TriangleLoopsTest {
    @Test
    public void getRow() {
        String expected = "********************";
        int width = 20;
        String actual = Ex02_TriangleLoops.getRow(width);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSmallTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = Ex02_TriangleLoops.getSmallTriangle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = Ex02_TriangleLoops.getLargeTriangle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest1() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = Ex02_TriangleLoops.getTriangle(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = Ex02_TriangleLoops.getTriangle(5);
        Assertions.assertEquals(expected, actual);
    }





}
