package com.ytg.leetcode.leetcode1;

import org.junit.Test;

/**
 *
 */
public class LeetCode437 {

    @Test
    public void say()
    {
        pathSum(null,1);
    }

    int res;

    public int pathSum(TreeNode root, int sum) {
        // 所以这道题只能采用双层递归，
        if(root == null) return 0;

        // 首先计算根节点
        backTrack(root,sum);
        // 然后计算左节点
        pathSum(root.left, sum);
        // 然后计算右节点
        pathSum(root.right, sum);

        /**
         * 注意，这个非常重要！！！一定要在主函数递归，不然无法找到所有的节点
         * 在这种正确的情况下，进入左儿子后，也会去继续进入左儿子的左儿子和右儿子
         * 不会有漏网之鱼
         */

        return res;
    }


    public void backTrack(TreeNode root,
                          int sum) {
        if (root==null) return;

        if(root.val==sum){
            res++;
        }

        backTrack(root.left, sum-root.val);
        backTrack(root.right, sum-root.val);

    }

}
