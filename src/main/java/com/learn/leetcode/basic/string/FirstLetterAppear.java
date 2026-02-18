package com.learn.leetcode.basic.string;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppear {

    private static char firstLetter(String s){

        Set<Character> set = new HashSet<>();
                for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }else {
                set.add(s.charAt(i));
            }
        }

        return s.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println(firstLetter("abaccdeff"));

    }
}
