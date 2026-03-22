package com.learn.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarray {

    public int maximumUniqueSubarray(int[] nums) {
        int res =0;
        int sum =0;
        int left =0;
        Set<Integer> seen = new HashSet<>();

        for(int right=0;right<nums.length;right++){


//            remove the element from the left side of the window until the duplicate is removed
            while(seen.contains(nums[right])){
                seen.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            seen.add(nums[right]);

            sum+=nums[right];

            res = Math.max(res,sum);

        }

        return res;
    }
// [4,2,4,5,6] , set =>{4,2} , sum = 6, next iteration will be 6+5-4 = 7
    public static void main(String[] args) {
            MaximumUniqueSubarray obj = new MaximumUniqueSubarray();
            System.out.println(obj.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
}
