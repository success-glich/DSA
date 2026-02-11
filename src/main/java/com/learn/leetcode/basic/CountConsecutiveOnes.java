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

//        * find max consecutive ones with you can flip k times 0 to 1.
        public int findMaxConsecutiveOnes2(int[] nums, int k) {

            int left =0;
            int ans =0;
            int windows =0;
            for(int right=0;right<nums.length;right++){
                windows += nums[right];
                while(windows<windows-1){
                    windows -= nums[left];
                    left++;

                }
                ans = Math.max(ans,windows);
            }
            return ans;
        }

    public static void main(String[] args) {
        int [] arr = {1,1,0,1, 0,1,1,1};
        System.out.println(new CountConsecutiveOnes().findMaxConsecutiveOnes2(arr,2));
    }
}
