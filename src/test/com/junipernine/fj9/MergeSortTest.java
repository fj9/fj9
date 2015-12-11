package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by f.juniper-nine on 11/12/2015.
 */
public class MergeSortTest {
    MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();

    }

    @Test
    public void testOneString() throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        List<String> result = mergeSort.sort(toSort);
        List<String> expected = toSort;
        assertThat(result, is(expected));
    }

    @Test
    public void testTwoStrings() throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        List<String> result = mergeSort.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob");
        assertThat(result, is(expected));
    }

    @Test
    public void testFourStrings() throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = mergeSort.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan");
        assertThat(result , is(expected));
    }
    @Test
    public void testMany() throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        toSort.add("fred");
        toSort.add("george");
        toSort.add("jim");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = mergeSort.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan", "fred", "george", "jim");
        assertThat(result , is(expected));
    }
    @Test
    public void testDuplicates() throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        toSort.add("dylan");
        toSort.add("dylan");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = mergeSort.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan", "dylan", "dylan");
        assertThat(result , is(expected));
    }
}