package com.ytg.leetcode.leetcode1;

public class LeetCode968 {

    int ans=0;

    public int minCameraCover(TreeNode root){
       if (root==null)
       {
           return 0;
       }
       if (dfs(root)==2)
       {
           ans=ans+1;
       }
        return ans;
    }

    public int dfs(TreeNode root)
    {
        if (root==null)
        {
            return 1;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        if (left==2 || right==2)
        {
            ans=ans+1;
            return 0;
        }else if (left == 0 || right == 0){
            return 1;
        } else
            return 2;
    }

}
