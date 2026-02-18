package com.learn.leetcode.basic.string;

public class EqualStringWithCost {
    public int equalSubstring(String s, String t, int maxCost) {

        int window=0,left=0,ans=0;

        for(int right=0;right<t.length()-1;right++){
            window += Math.abs(s.charAt(right)-t.charAt(right));

            while(window>maxCost){

                window-=Math.abs(s.charAt(left)-t.charAt(left));

                left++;


            }

            ans = Math.max(ans,right-left+1);
        }

        return ans;

    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdef";
        int maxCost = 3;
        System.out.println(new EqualStringWithCost().equalSubstring(s,t,maxCost));
    }
}
