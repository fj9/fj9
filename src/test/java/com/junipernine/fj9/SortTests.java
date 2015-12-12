package com.junipernine.fj9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 12/12/2015.
 */
public class SortTests {

    public static void testOneString(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        List<String> result = sorter.sort(toSort);
        List<String> expected = toSort;
        assertThat(result, is(expected));
    }

    public static void testTwoStrings(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        List<String> result = sorter.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob");
        assertThat(result, is(expected));
    }

    public static void testFourStrings(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = sorter.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan");
        assertThat(result, is(expected));
    }

    public static void testThreeStrings(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("amy");
        toSort.add("chris");
        toSort.add("dylan");
        List<String> result = sorter.sort(toSort);
        List<String> expected = Arrays.asList("amy", "chris", "dylan");
        assertThat(result, is(expected));
    }

    public static void testMany(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("jill");
        toSort.add("amy");
        toSort.add("george");
        toSort.add("bob");
        toSort.add("zach");
        toSort.add("lol");
        toSort.add("mark");
        toSort.add("fred");
        toSort.add("jim");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = sorter.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan", "fred", "george", "jill", "jim", "lol", "mark", "zach");
        assertThat(result, is(expected));
    }

    public static void testDuplicates(Sorter sorter) throws Exception {
        List<String> toSort = new ArrayList<String>();
        toSort.add("bob");
        toSort.add("amy");
        toSort.add("dylan");
        toSort.add("dylan");
        toSort.add("dylan");
        toSort.add("chris");
        List<String> result = sorter.sort(toSort);
        List<String> expected = Arrays.asList("amy", "bob", "chris", "dylan", "dylan", "dylan");
        assertThat(result, is(expected));
    }
}
