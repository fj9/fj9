package com.junipernine.fj9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 12/12/2015.
 */
public class InsertionSort implements Sorter {
    public List<String> sort(List<String> strings) {
        if (strings.size() > 1) {
            List<String> sorted = new ArrayList<>(strings.size());
            for (String candidate : strings) {
                sorted.add(establishIndexFor(candidate, sorted), candidate);

            }
            return sorted;
        } else {
            return strings;
        }

    }

    private int establishIndexFor(String candidate, List<String> sorted) {
        if(sorted.isEmpty())
            return 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (candidate.compareTo(sorted.get(i)) >= 0)
                if (i < sorted.size() - 1) {
                    if (candidate.compareTo(sorted.get(i + 1)) <= 0) {
                        return i + 1;
                    }
                } else {
                    return sorted.size();
                }
            else {
                return i;
            }
        }
        return sorted.size();
    }
}
