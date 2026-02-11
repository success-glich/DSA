package com.learn.leetcode.basic;

public class CountConsecutiveOnes {

        public int findMaxConsecutiveOnes(int[] nums) {

            // raw form
            // int maxCount =0;
            // int count =0;

            // for(int i=0;i<nums.length;i++){
            //     if(nums[i]==1){
            //         count++;

            //         maxCount = Math.max(maxCount,count);
            //     }else{
            //         count=0;
            //     }
            // }

            // return maxCount;


            //* sliding windows,

            int left =0;
            int ans = 0;
            int windows = 0;

            for(int right=0;right<nums.length;right++){
                windows += nums[right];

                while(windows!=right-left+1){
                    windows -= nums[left];
                    left++;
                }

                ans = Math.max(ans,windows);

            }

            return ans;
        }

    public static void main(String[] args) {

    }
}
