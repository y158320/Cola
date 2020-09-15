package com.ytg.leetcode.competition;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个正整数数组 arr，请你找出一个长度为 m 且在数组中至少重复 k 次的模式。
 *
 * 模式 是由一个或多个值组成的子数组（连续的子序列），连续 重复多次但 不重叠 。 模式由其长度和重复次数定义。
 *
 * 如果数组中存在至少重复 k 次且长度为 m 的模式，则返回 true ，否则返回  false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [1,2,4,4,4,4], m = 1, k = 3
 * 输出：true
 * 解释：模式 (4) 的长度为 1 ，且连续重复 4 次。注意，模式可以重复 k 次或更多次，但不能少于 k 次。
 * 示例 2：
 *
 * 输入：arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
 * 输出：true
 * 解释：模式 (1,2) 长度为 2 ，且连续重复 2 次。另一个符合题意的模式是 (2,1) ，同样重复 2 次。
 * 示例 3：
 *
 * 输入：arr = [1,2,1,2,1,3], m = 2, k = 3
 * 输出：false
 * 解释：模式 (1,2) 长度为 2 ，但是只连续重复 2 次。不存在长度为 2 且至少重复 3 次的模式。
 * 示例 4：
 *
 * 输入：arr = [1,2,3,1,2], m = 2, k = 2
 * 输出：false
 * 解释：模式 (1,2) 出现 2 次但并不连续，所以不能算作连续重复 2 次。
 * 示例 5：
 *
 * 输入：arr = [2,2,2,2], m = 2, k = 3
 * 输出：false
 * 解释：长度为 2 的模式只有 (2,2) ，但是只连续重复 2 次。注意，不能计算重叠的重复次数。
 *
 */
public class week1566 {

    public boolean containsPattern(int[] arr, int m, int k) {
        int len = m*k;
        if (arr.length<len)
        {
            return false;
        }
        for(int i = 0; i <= arr.length - len; i++){
            boolean check = true;
            for(int j = i + m;j < i + k*m ; j++){
                if(arr[j] != arr[j-m])
                {
                    check = false;
                }
            }
            if(check) {
                return true;
            }
        }
        return false;
    }

}
