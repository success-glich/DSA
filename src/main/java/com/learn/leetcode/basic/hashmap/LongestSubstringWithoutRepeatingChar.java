package com.learn.leetcode.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

    public int maxSubString(String s){

        int res =0;
        int left =0;
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int right=0;right<arr.length;right++){
            int currIdx = map.getOrDefault(arr[right],-1);

            if(currIdx!=-1 ){
                res = Math.max(res,right-1-left+1);
                left = currIdx+1;
            }
            map.put(arr[right],right);
            res = Math.max(res,right-left+1);


        }

        return res;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChar obj = new LongestSubstringWithoutRepeatingChar();
        System.out.println(obj.maxSubString("abcadabb"));
    }
}
