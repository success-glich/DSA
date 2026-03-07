package com.learn.leetcode.basic.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// array as index as frequency , and it called as bucket sort:
/*


 */

public class SortCharacterByString {

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        List<Character>[] arr = new ArrayList[s.length()+1];

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        map.keySet().forEach(
                c->{
                    if(arr[map.get(c)]==null){
                        arr[map.get(c)] = new ArrayList<>();
                    }
                    arr[map.get(c)].add(c);

                }
        );
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                for(char c:arr[i]){
                  for(int j=0;j<i;j++){
                      sb.append(c);
                  }
                }
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        SortCharacterByString obj = new SortCharacterByString();
        System.out.println(obj.frequencySort("tree"));
    }
}
