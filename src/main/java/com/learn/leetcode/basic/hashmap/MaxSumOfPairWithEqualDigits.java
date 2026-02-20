package com.learn.leetcode.basic.hashmap;

import java.util.HashMap;
import java.util.Map;
public class MaxSumOfPairWithEqualDigits {

    public int maximumSum(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int res =-1;
        for(int i =0;i<nums.length;i++){
            int s = sum(nums[i]);


            if(map.containsKey(s)){
                res = Math.max(res, (nums[i]+map.get(s)));

                if(nums[i]>map.get(s)){
                    map.put(s,nums[i]);
                }
            }

            map.put(s,nums[i]);
        }
        return res;

    }

    public int sum(int n){
//        return (n*(n-1))/2;


        int sum = 0;
        while(n>0){
            sum +=n%10;
            n =  n/10;

        }
        return sum;
    }

    public static void main(String[] args) {

        int [] arr ={18,43,36,13,7};
        MaxSumOfPairWithEqualDigits obj = new MaxSumOfPairWithEqualDigits();
        System.out.println(obj.maximumSum(arr));
    }
}
