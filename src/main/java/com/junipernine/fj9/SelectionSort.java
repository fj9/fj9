package com.junipernine.fj9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 12/12/2015.
 */
public class SelectionSort implements Sorter {

    public List<String> sort(List<String> strings) {
        if (strings.size() > 1) {
            List<String> sorted = new ArrayList<>();
            int i =0;
            while (i < strings.size()) {
                if (smallestString(strings.get(i), strings.subList(i + 1, strings.size()))) {
                    sorted.add(strings.get(i));
                    strings.remove(i);
                    i = 0;
                }else
                    i++;
            }
            return sorted;
        } else {
            return strings;
        }
    }

    private boolean smallestString(String candidate, List<String> strings) {
        for (String s : strings) {
            if (candidate.compareTo(s) > 0)
                return false;
        }
        return true;
    }
}
