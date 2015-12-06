package com.junipernine.fj9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 06/12/2015.
 */
public class MergeSort {

    public List<String> sort(List<String> strings) {
        if (strings.size() > 1) {
            List<String> left = sort(strings.subList(0, strings.size() / 2));
            List<String> right = sort(strings.subList(strings.size() / 2, strings.size()));
            return merge(left, right);
        }
        return strings;
    }

    private List<String> merge(List<String> left, List<String> right) {
        List<String> result = new ArrayList<>();
        int leftI = 0;
        int rightI = 0;
        while (leftI < left.size() && rightI < right.size()) {
            if (left.get(leftI).compareTo(right.get(rightI)) < 0) {
                result.add(left.get(leftI));
                leftI++;
            } else {
                result.add(right.get(rightI));
                rightI++;
            }
        }
        if (leftI < left.size()) {
            result.addAll(left.subList(leftI, left.size()));
        }
        if ((rightI < right.size())) {
            result.addAll(right.subList(rightI, right.size()));
        }
        return result;
    }


}
