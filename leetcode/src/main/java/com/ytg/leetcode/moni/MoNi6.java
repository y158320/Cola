package com.ytg.leetcode.moni;

/**
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 *
 */
public class MoNi6 {
    public boolean isPowerOfFour(int num) {
        String str = Integer.toBinaryString(num);
        str = str.replace("00","");
        return str.equals("1");
    }

}
