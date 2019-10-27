package com.alevel.home4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTest {

    private Area area;

    @Before
    public void before() {
        area = new Area();
    }

    @Test
    public void maxAreaTest() {
        int result = area.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        int expected = 49;
        assertEquals(expected, result);
    }
}