package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created on 06/12/2015.
 */
public class MergeSortTest {
    MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();

    }

    @Test
    public void testOneString() throws Exception {
        SortTests.testOneString(mergeSort);
    }

    @Test
    public void testTwoStrings() throws Exception {
        SortTests.testTwoStrings(mergeSort);
    }

    @Test
    public void testFourStrings() throws Exception {
        SortTests.testFourStrings(mergeSort);
    }

    @Test
    public void testThreeStrings() throws Exception {
        SortTests.testThreeStrings(mergeSort);
    }

    @Test
    public void testMany() throws Exception {
        SortTests.testMany(mergeSort);
    }

    @Test
    public void testDuplicates() throws Exception {
        SortTests.testDuplicates(mergeSort);
    }
}