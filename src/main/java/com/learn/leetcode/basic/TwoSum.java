package com.learn.leetcode.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int [] twoSumSolution(int[] nums, int target){
        //* method 1: sorted array
//        int start = 0;
//        int end = nums.length-1;
//
//        while (start<end){
//            if(nums[start]+nums[end] ==target){
//                return new int [] {start,end};
//            }else if (nums[start]+nums[end]<target){
//                start++;
//            }else {
//                end--;
//            }
//        }
//
//        return new int[] {-1,-1};

        int length = nums.length;
        Map<Integer,Integer> visitedMap = new HashMap<>();

        for(int i =0;i<length;i++){
            int result = target-nums[i];
            if(visitedMap.containsKey(result)){
                return  new int[] {visitedMap.get(result),i};
            }
            visitedMap.put(nums[i],i);
        }
        return  new int [] {-1,-1};
    }

    public static void main(String[] args) {
       int [] result=  TwoSum.twoSumSolution(new int[]{2,7,11,15},9);
        System.out.println("result::"+ Arrays.toString(result));

    }


}
