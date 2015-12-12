package com.junipernine.fj9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created on 06/12/2015.
 */
public class QuickSort implements Sorter{

    public List<String> sort(List<String> strings) {
        if (strings.size() > 1) {
            return sort(0, strings.size() - 1, strings);
        } else {
            return strings;
        }

    }

    private List<String> sort(int lowerIndex, int higherIndex, List<String> strings) {
        if (higherIndex - lowerIndex > 0) {

            int partitionItemIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
            String partitionItem = strings.get(partitionItemIndex);
            int left = lowerIndex;
            int right = higherIndex;
            while (left < right) {
                while (left <= higherIndex && strings.get(left).compareTo(partitionItem) <= 0) {
                    left++;
                }
                if (left < right) {
                    Collections.swap(strings, left, right);
                    right--;
                }
            }
            Collections.swap(strings, lowerIndex, right);
            sort(lowerIndex, right - 1, strings);
            sort(right, higherIndex, strings);
        }
        return strings;
    }

}
