package com.learn.leetcode.basic.string;

import java.util.HashSet;
import java.util.Set;

public class Pangram {



    public boolean checkIfPangram(String s) {


        Set<Character> set = new HashSet<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
            set.add(s.charAt(i));


        }

        return set.size()==26;
    }

    public static void main(String[] args) {
        Pangram pangram = new Pangram();
        System.out.println(pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
