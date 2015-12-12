package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created on 12/12/2015.
 */
public class InsertionSortTest {
    InsertionSort insertionSort;

    @Before
    public void setUp() throws Exception {
        insertionSort = new InsertionSort();

    }

    @Test
    public void testOneString() throws Exception {
        SortTests.testOneString(insertionSort);
    }

    @Test
    public void testTwoStrings() throws Exception {
        SortTests.testTwoStrings(insertionSort);
    }

    @Test
    public void testFourStrings() throws Exception {
        SortTests.testFourStrings(insertionSort);
    }

    @Test
    public void testThreeStrings() throws Exception {
        SortTests.testThreeStrings(insertionSort);
    }

    @Test
    public void testMany() throws Exception {
        SortTests.testMany(insertionSort);
    }

    @Test
    public void testDuplicates() throws Exception {
        SortTests.testDuplicates(insertionSort);
    }


}