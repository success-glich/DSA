package com.learn.leetcode.basic;

public class MaximumAverageSubArrayI {

    public double findMaxAverage(int[] nums, int k) {


        double sum =0;


        for(int i=0;i<=nums.length-k;i++){
            double currentSum = 0;
            for (int j = i; j <i+ k; j++) {
                currentSum+=nums[j];
            }
            sum= Math.max(sum,currentSum);
        }
        return sum/k;
    }
    public double findMaxAverage1(int[] nums, int k) {
        double ans=0;
        double window = 0.0;
        for(int i=0;i<k;i++){
            window+=nums[i];
        }

        for(int i=k;i<nums.length;i++){
            window = window+nums[i]-nums[i-k];
            ans = Math.max(window,ans);
        }
        return ans/k;
    }

    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        System.out.println(new MaximumAverageSubArrayI().findMaxAverage(arr,4));
        System.out.println(new MaximumAverageSubArrayI().findMaxAverage1(arr,4));

    }
}
