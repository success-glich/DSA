package com.learn.leetcode.basic.hashmap;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {

        int [] count  = new int [101];

        for(int i =0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int result = 0;
        for(int n : count){

            result += (n* (n-1))/2;
        }

        return result;

    }
}
