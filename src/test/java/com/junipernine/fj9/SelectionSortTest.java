package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created on 12/12/2015.
 */
public class SelectionSortTest {
    SelectionSort selectionSort;

    @Before
    public void setUp() throws Exception {
        selectionSort = new SelectionSort();

    }

    @Test
    public void testOneString() throws Exception {
        SortTests.testOneString(selectionSort);
    }

    @Test
    public void testTwoStrings() throws Exception {
        SortTests.testTwoStrings(selectionSort);
    }

    @Test
    public void testFourStrings() throws Exception {
        SortTests.testFourStrings(selectionSort);
    }

    @Test
    public void testThreeStrings() throws Exception {
        SortTests.testThreeStrings(selectionSort);
    }

    @Test
    public void testMany() throws Exception {
        SortTests.testMany(selectionSort);
    }

    @Test
    public void testDuplicates() throws Exception {
        SortTests.testDuplicates(selectionSort);
    }

}