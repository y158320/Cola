package com.ytg.leetcode.leetcode1;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1207 {

    public boolean uniqueOccurrences(int[] arr) {
        int[] num = new int[2001];
        for(int n : arr){
            num[n+1000]++;
        }

        Set<Integer> set = new HashSet<>();
        for(int n : num){
            if(n != 0){
                if(set.contains(n)){
                    return false;
                }
                set.add(n);
            }
        }

        return true;
    }

}
