package com.ytg.leetcode.competition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个下标从 0 开始的字符串 words ，其中 words[i] 由小写英文字符组成。
 *
 * 在一步操作中，需要选出任一下标 i ，从 words 中 删除 words[i] 。其中下标 i 需要同时满足下述两个条件：
 *
 * 0 < i < words.length
 * words[i - 1] 和 words[i] 是 字母异位词 。
 * 只要可以选出满足条件的下标，就一直执行这个操作。
 *
 * 在执行所有操作后，返回 words 。可以证明，按任意顺序为每步操作选择下标都会得到相同的结果。
 *
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。例如，"dacb" 是 "abdc" 的一个字母异位词。
 *
 */
public class week2273 {

    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String lastSortWord = "";
        for (String word : words) {
            String sortWord = sort(word);
            // 排列后和前面的不相同则不是 字母异位词
            if (!sortWord.equals(lastSortWord)) {
                ans.add(word);
                lastSortWord = sortWord;
            }
        }

        return ans;
    }

    // 字典排序重新排列单词
    public String sort(String str) {
        char[] words = str.toCharArray();
        Arrays.sort(words);
        return new String(words);
    }

}
