package com.ytg.leetcode.leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,1,4,null,2], k = 1
 * 输出：1
 * 示例 2：
 *
 *
 * 输入：root = [5,3,6,2,4,null,null,1], k = 3
 * 输出：3
 *
 */
public class LeetCode230 {

    List<Integer> list=new ArrayList<>();

    //中序遍历
    public int kthSmallest(TreeNode root, int k) {
       so(root);
       if (list.size()<k)
       {
           return list.get(list.size()-1);
       }else
       {
           return list.get(k-1);
       }
    }

    public List<Integer> so(TreeNode treeNode)
    {
        if (treeNode==null)
        {
            return null;
        }
        so(treeNode.left);
        list.add(treeNode.val);
        so(treeNode.right);
        return list;
    }

}
