package com.learn.leetcode.basic;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicateFromSortedArray {


        public int removeDuplicates(int[] nums) {
            int pointer = 0;

            for(int i =0;i<nums.length-1
                    ;i++){



                if(nums[i]!=nums[i+1]){

                    nums[pointer] = nums[i+1];

                    pointer++;
                }
            }

            return nums.length-1;
        }

    public static void main(String[] args) {

     RemoveDuplicateFromSortedArray myObj = new RemoveDuplicateFromSortedArray();
     int [] myArr = new int[] {1,1,2};

     int result = myObj.removeDuplicates(myArr);

        System.out.println(result);
        System.out.println(Arrays.toString(myArr));
    }

}
