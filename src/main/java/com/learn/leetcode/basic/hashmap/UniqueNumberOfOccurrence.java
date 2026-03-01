package com.learn.leetcode.basic.hashmap;

import java.util.Arrays;

public class UniqueNumberOfOccurrence {
    public boolean uniqueOccurrences(int[] arr) {

        int [] count = new int[2001];

        for(int i:arr){

            count[i+1000]++;
        }

        Arrays.sort(count);
        for(int i=0;i<count.length-1;i++){
            if(count[i]==count[i+1]){
                return false;
            }
        }
        return true;
    }
}
