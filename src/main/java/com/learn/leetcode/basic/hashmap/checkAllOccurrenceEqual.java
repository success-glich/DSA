package com.learn.leetcode.basic.hashmap;

public class checkAllOccurrenceEqual {

    public boolean areOccurrenceEqual(String s) {
        int [] count = new int[26];
        for(char c: s.toCharArray()){
            count[c-'a']++;
        }
        int maxCount = count[0];

        for(int i:count){

            if(i!=maxCount && i!=0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        checkAllOccurrenceEqual obj = new checkAllOccurrenceEqual();
        System.out.println(obj.areOccurrenceEqual("abacbc"));
    }
}
