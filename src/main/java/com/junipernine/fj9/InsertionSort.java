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
                if (sorted.isEmpty())
                    sorted.add(candidate);
                else {
                    for (int i = 0; i < sorted.size(); i++) {
                        if (candidate.compareTo(sorted.get(i)) >= 0)
                            if (i < sorted.size() - 1) {
                                if (candidate.compareTo(sorted.get(i + 1)) <= 0) {
                                    sorted.add(i + 1, candidate);
                                    break;
                                }
                            } else {
                                sorted.add(candidate);
                                break;
                            }
                        else {
                            sorted.add(i, candidate);
                            break;
                        }
                    }
                }
            }
            return sorted;
        } else {
            return strings;
        }

    }
}
