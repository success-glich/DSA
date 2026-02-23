package com.learn.leetcode.basic.hashmap;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {

        // int [] ch = new int[26];
        Set<Character> set = new HashSet<>();
        int result =0;
        for (char c: jewels.toCharArray()){
            set.add(c);
        }

        for(char c: stones.toCharArray()){

            if(set.contains(c)){
                result++;
            }
        }

        return result;

    }
}
