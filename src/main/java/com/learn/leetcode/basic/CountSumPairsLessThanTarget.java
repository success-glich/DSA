package com.learn.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSumPairsLessThanTarget {

    public int countPairs(List<Integer> arr, int target) {
        arr.sort(Integer::compareTo);
    int result = 0;
        int l = 0;
        int r = arr.size()-1;

        for (int i = 0; i < arr.size(); i++) {

            while(l<r){
               if(arr.get(l)+arr.get(r)<target){
                   result +=r-l;

                   l++;
               }else{
                   r--;
               }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        immuatable e
//        List<Integer> nums = List.of(1,33,4,3,9);

        List<Integer> nums = Arrays.asList(1,33,4,3,9);

        CountSumPairsLessThanTarget countSumPairsLessThanTarget = new CountSumPairsLessThanTarget();
        System.out.println(countSumPairsLessThanTarget.countPairs(nums,6));
    }
}
