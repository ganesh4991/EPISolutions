package com.epi.arrays;

import java.util.Collections;
import java.util.List;

public class DNF {
    public List<Integer> solve(List<Integer> input, int pivotIndex) {
        int low = 0, mid = 0, high = input.size()-1;
        int pivot = input.get(pivotIndex);

        while (mid <= high) {
            int currentValue = input.get(mid);
            if (currentValue < pivot) {
                Collections.swap(input, low++, mid++);
            } else if (currentValue > pivot) {
                Collections.swap(input, high--, mid);
            } else {
                mid++;
            }
        }
        return input;
    }
}