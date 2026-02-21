package com.learn.leetcode.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] arr = new int[26];


//        time complexity O(n) using hashmap while space complexity O(1) when we use int array as it only takes 26 chracters.
        Map<Character,Integer> map = new HashMap<>();

        for(char c: ransomNote.toCharArray()){
//            arr[c-'a']++;

            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: magazine.toCharArray()){
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
//            arr[c-'a']--;
        }


        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>0){
                return false;
            }

        }

//
//        for(int i:arr){
//            if(i>0){
//                return false;
//            }
//        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new RansomNote().canConstruct("a","baaa"));
    }
}
// ransom note can be constructed from magazine only if magazine contains all the characters of ransom note
// ransom