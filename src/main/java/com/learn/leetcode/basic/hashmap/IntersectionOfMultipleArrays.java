package com.learn.leetcode.basic.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfMultipleArrays {

        public List<Integer> intersection(int[][] nums) {

            Map<Integer,Integer> map = new HashMap<>();

            int len = nums.length;

            for(int [] arr: nums){

                for(int i:arr){

                    int curr = map.getOrDefault(i,0)+1;

                    map.put(i,curr);


                }

            }



            return map.keySet().stream().filter(i->map.get(i)==len).sorted().collect(Collectors.toList());





        }
}
