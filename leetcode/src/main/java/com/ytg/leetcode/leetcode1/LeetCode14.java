package com.ytg.leetcode.leetcode1;

import org.junit.Test;

import java.util.LinkedList;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 */
public class LeetCode14 {



    @Test
    public void say()
    {
        String[] strs={"flower","flow","flight"};
//        System.out.println("flower".indexOf("flower"));
//        System.out.println(longestCommonPrefix1(strs));
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            System.out.println(strs[i].indexOf(prefix) != 0);
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        LinkedList<Integer> track = new LinkedList<>();
        backString(strs, 0, track);
        return "";
    }

    public void backString(String[] strs,int start,LinkedList<Integer> track)
    {
     for (int i=0;i<strs.length;i++)
     {
//         a=
     }
    }

}
