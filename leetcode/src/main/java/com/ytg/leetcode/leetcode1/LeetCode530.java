package com.ytg.leetcode.leetcode1;

/**
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 *
 *  
 *
 * 示例：
 *
 * 输入：
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * 输出：
 * 1
 *
 * 解释：
 * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 *
 */
public class LeetCode530 {

    private int res=0;

    public int getMinimumDifference(TreeNode root) {

       if (root==null)
       {
           return res;
       }
       res=root.val;
       dfs(root);
       return res;
    }

    public void dfs(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            return ;
        }else if (root.left==null)
        {
            res=Math.min(res,Math.abs(root.val)-Math.abs(root.right.val));
        }else if (root.right==null)
        {
            res=Math.min(res,Math.abs(root.val)-Math.abs(root.left.val));
        }else
        {
            res=Math.min(res,Math.max(Math.abs(root.val)-Math.abs(root.left.val),Math.abs(root.val)-Math.abs(root.left.val)));
        }
        dfs(root.right);
        dfs(root.left);
    }

}
