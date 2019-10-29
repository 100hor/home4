package com.alevel.home4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagTest {

    private ZigZag zigZag;
    @Before
    public void before() {
        System.out.println("before running");
        zigZag = new ZigZag();
    }
    @Test
    public void convertTest() {
        String result = zigZag.convert("abcde", 3);
        String expected = new String("aebdc");
        assertEquals(expected, result);
    }
}