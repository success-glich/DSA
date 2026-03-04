package com.learn.leetcode;

import java.util.*;

public class BucketSort {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        int[] results = new int[k];
        for(int i: nums){
            count.put(i, count.getOrDefault(i,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int i=0;i<buckets.length;i++){

            buckets[i] = new ArrayList<>();
        }

        for(int i: count.keySet()){

            buckets[count.get(i)].add(i);
        }

        List<Integer> temp = new ArrayList<>();
        for(int i =buckets.length-1;i>0;i--){
            List<Integer> bucket = buckets[i];

            for(int b: bucket){
                temp.add(b);
            }
        }

        while(k>0){
            k--;
            results [k] = temp.get(k);

        }
        return  results;

    }

    public static void main(String[] args) {
        BucketSort obj = new BucketSort();
        System.out.println(Arrays.toString(obj.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
