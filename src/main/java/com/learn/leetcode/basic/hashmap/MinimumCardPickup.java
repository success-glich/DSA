package com.learn.leetcode.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MinimumCardPickup {
    public int minimumCardPickup(int[] cards) {

        Map<Integer,Integer> map = new HashMap<>();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                res = Math.min(res,i-map.get(cards[i])+1);
            }

            map.put(cards[i],i);


        }
        return res==Integer.MAX_VALUE?-1:res;
    }

    public static void main(String[] args) {

        MinimumCardPickup obj = new MinimumCardPickup();
        System.out.println(obj.minimumCardPickup(new int[]{3,4,2,3,4,7}));
    }
}
