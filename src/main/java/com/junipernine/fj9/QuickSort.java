package com.junipernine.fj9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created on 06/12/2015.
 */
public class QuickSort implements Sorter {

    public List<String> sort(List<String> strings) {
        if (strings.size() > 1) {
            return sort(0, strings.size() - 1, strings);
        } else {
            return strings;
        }

    }

    private List<String> sort(int lowerIndex, int higherIndex, List<String> strings) {

        if (higherIndex - lowerIndex > 0) {

            int partitionItemIndex = (int) Math.floor(higherIndex / 2);
            String partitionItem = strings.get(lowerIndex);
            int left = lowerIndex;
            int right = higherIndex;
            while (right > left) {
                while (left <= higherIndex && strings.get(left).compareTo(partitionItem) <= 0 && right > left) {
                    left++;
                }
                while (right >= lowerIndex && strings.get(right).compareTo(partitionItem) > 0 && right >= left) {
                    right --;
                }
                if (left <= right) {
                    Collections.swap(strings, left, right);
                }

            }
            Collections.swap(strings, lowerIndex, right);
            sort(lowerIndex, left-1, strings);
            sort(left, higherIndex, strings);
        }
        return strings;
    }


}
