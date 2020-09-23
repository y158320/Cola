package com.ytg.leetcode.leetcode1;

import org.junit.jupiter.api.Test;

public class LeetCode617 {

    @Test
    public void say()
    {
        mergeTrees(null,null);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null)
        {
            return null;
        }else if (t1!=null&& t2==null)
        {
            mergeTrees(t1.left,null);
            mergeTrees(t1.right,null);
        }else if (t1==null&& t2!=null)
        {
            t1=new TreeNode(t2.val);
            t1.left=mergeTrees(t2.left,null);
            t1.right=mergeTrees(t2.right,null);
        }else {
            t1.val=t1.val+t2.val;
            t1.left=mergeTrees(t1.left,t2.left);
            t1.right=mergeTrees(t1.right,t2.right);
        }
        return t1;
    }



}
