package com.epi.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplyBigIntegers {

    public List<Integer> multiply(List<Integer> number, int multiplier) {
        List<Integer> result = new ArrayList<Integer>();

        int carry = 0;

        for (int i = number.size()-1; i >= 0; i--) {
            int digit = number.get(i)*multiplier + carry;
            carry = digit/10;
            result.add(digit%10);
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }

    public List<Integer> add(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        Collections.reverse(a);
        Collections.reverse(b);
        for (int i = b.size(); i < a.size(); i++) {
            b.add(0);
        }

        int carry = 0;

        for (int i = 0; i < a.size(); i++) {
            int digit = a.get(i) + b.get(i) + carry;
            carry = digit/10;
            result.add(digit%10);
        }

        if (carry > 0) {
            result.add(1);
        }

        Collections.reverse(result);
        return result;
    }

    public List<Integer> solve(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();

        List<Integer> smaller, bigger;

        if (a.size() > b.size()) {
            smaller = b;
            bigger = a;
        } else {
            smaller = a;
            bigger = b;
        }

        int sign = a.get(0) * b.get(0) > 0 ? 1 : -1;
        a.set(0, Math.abs(a.get(0)));
        b.set(0, Math.abs(b.get(0)));

        for (int i = smaller.size()-1; i >= 0; i--) {
            List<Integer> temp = multiply(bigger, smaller.get(i));
            for (int j = 0; j < smaller.size()-1-i; j++) {
                temp.add(0);
            }
            result = add(temp, result);
        }

        int number = result.get(0) * sign;
        result.set(0, number);
        return result;
    }
}