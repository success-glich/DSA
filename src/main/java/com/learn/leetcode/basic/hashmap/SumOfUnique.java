package com.learn.leetcode.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {

    public int sumOfUnique(int[] nums) {
        int sum =0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){

            map.put(i,map.getOrDefault(i,0)+1);
        }

//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//
//            if(entry.getValue()==1){
//                sum+=entry.getKey();
//            }
//
//        }

        for(int i:map.keySet()){
            if(map.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,2};
        SumOfUnique sumOfUnique = new SumOfUnique();
        System.out.println(sumOfUnique.sumOfUnique(arr));
    }
}
