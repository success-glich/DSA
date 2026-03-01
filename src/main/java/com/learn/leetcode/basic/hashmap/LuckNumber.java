package com.learn.leetcode.basic.hashmap;

public class LuckNumber {
    public int luckyNumber(int[] nums) {
        int [] ca = new int[501];
        for(int i: nums){
            ca[i]++;
        }

        for(int i =500;i>0;i--){
            if(i==ca[i]){
                return i;
            }
        }

        return -1;
    }
}
