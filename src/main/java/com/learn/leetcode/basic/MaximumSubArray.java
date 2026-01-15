package com.learn.leetcode.basic;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int globalMax = nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentSum+nums[i]<nums[i]){
                currentSum =nums[i];
            }else {
                currentSum+=nums[i];
            }
            globalMax = Math.max(currentSum,globalMax);
        }



        return globalMax;
    }

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray.maxSubArray(arr));
    }
}
