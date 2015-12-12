package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created on 06/12/2015.‚
 */
public class QuickSortTest {
    QuickSort quickSort;

    @Before
    public void setUp() throws Exception {
        quickSort = new QuickSort();

    }

    @Test
    public void testOneString() throws Exception {
        SortTests.testOneString(quickSort);
    }

    @Test
    public void testTwoStrings() throws Exception {
        SortTests.testTwoStrings(quickSort);
    }

    @Test
    public void testFourStrings() throws Exception {
        SortTests.testFourStrings(quickSort);
    }

    @Test
    public void testThreeStrings() throws Exception {
        SortTests.testThreeStrings(quickSort);
    }

    @Test
    public void testMany() throws Exception {
        SortTests.testMany(quickSort);
    }

    @Test
    public void testDuplicates() throws Exception {
        SortTests.testDuplicates(quickSort);
    }

}