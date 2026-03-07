package com.learn.leetcode.basic.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();

        String[] arr = s.split(" ");

        if(arr.length != pattern.length()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = arr[i];
            if((map.containsKey(ch) && !map.get(ch).equals(word)) || (!map.containsKey(ch) && map.values().contains(word) )){

                return false;
            }

            map.put(ch,word);
        }

        return true;

    }

    public static void main(String[] args) {

        WordPattern obj = new WordPattern();
        System.out.println(obj.wordPattern("abba","dog cat cat dog"));
    }
}
