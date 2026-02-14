package com.learn.leetcode.basic.string;

import java.util.ArrayList;
import java.util.List;

public class MaximumNoOfVowelsInSubstring {

    public int maxVowels(String s, int k) {
//        * brute force approach
        char[] arr = s.toCharArray();
        int count =0;
        for(int i=0;i<arr.length-k+1;i++){
            int vowels =0;
            for(int j=i;j<i+k;j++){
               vowels+=isVowel(arr[j]);
            }
            count = Math.max(count,vowels);
        }
        return count;
    }
    public int maxVowels1(String s, int k) {

//        Window Sliding
        int left =0;
        int right =0;
        int count =0;
        int window =0;

        for(;right<k;right++){
            window = window + isVowel(s.charAt(right));
        }

        count = window;
        while(right<s.length()){

            window = window + isVowel(s.charAt(right))-isVowel(s.charAt(right-k));
            count = Math.max(count,window);
            right++;
        }
        return count;

    }

    public  int isVowel(char ch){
        List<Character> vowels = List.of('a','e','i','o','u');
        return vowels.contains(ch)?1:0;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(new MaximumNoOfVowelsInSubstring().maxVowels(s,k));
        System.out.println(new MaximumNoOfVowelsInSubstring().maxVowels1(s,k));
    }
}
