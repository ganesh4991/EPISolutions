package com.epi.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncrementNumber {

    public List<Integer> solve(List<Integer> input) {
        Collections.reverse(input);
        int size = input.size();
        int carry = 0;

        for(int i = 0; i < input.size(); i++) {
            int currentDigit = input.get(i);
            int digit = i == 0 ? currentDigit + 1 : currentDigit + carry;
            carry = digit/10;
            input.set(i, digit%10);
        }

        if (carry == 1) {
            input = new ArrayList<Integer>(input);
            input.add(1);
        }

        Collections.reverse(input);
        return input;
    }
}
