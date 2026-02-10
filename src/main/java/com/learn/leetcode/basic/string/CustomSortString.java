package com.learn.leetcode.basic.string;

import java.util.HashSet;
import java.util.Set;

public class CustomSortString {

    public  String customSortString(String order, String s) {

        StringBuilder sb = new StringBuilder();
        Set<Character> set =  new HashSet<>();
//        1. Map frequencies of characters in s
        int [] count = new int [26];
//        stored the order charcter
        for(char c: order.toCharArray()){
            set.add(c);
        }


        for (char c : s.toCharArray()){

//            Append characters that were not in 'order'
            if(!set.contains(c)){
                sb.append(c);
            }else{

        // add the character appear in s  and  increase the count
                count[c-'a']++;
            }

        }

        for(char c : order.toCharArray()){
            int i = count[c-'a'];

            while(i>0){

                sb.append(c);

                i--;
            }
        }


        // 2. Build the result based on sequence in 'order'
        // 3.

        return sb.toString();
    }

    public static void main(String[] args) {
//         chars is 26
        System.out.println('b'-'a');

        String order = "cba";
        String s = "abcd";


        System.out.println(new CustomSortString().customSortString(order, s));


    }
}
