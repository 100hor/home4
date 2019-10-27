package com.alevel.home4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthTest {

    private MaxLength maxLength;

    @Before
    public void before() {
        System.out.println("before running blabla");
        maxLength = new MaxLength();
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        int result = maxLength.lengthOfLongestSubstring("pwwkew");
        assertEquals(3 , result);
    }
}