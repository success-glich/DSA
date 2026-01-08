package com.learn.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsElement {

    public static boolean isContainsDuplicateElement(int [] arr){

        Set<Integer> seen = new HashSet<>();

        for (int currentValue : arr) {
            if (seen.contains(currentValue)) {
                return true;
            }
            seen.add(currentValue);
        }

        return false;
    }
}
