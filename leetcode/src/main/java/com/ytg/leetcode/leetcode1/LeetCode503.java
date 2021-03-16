package com.ytg.leetcode.leetcode1;

/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * 示例 1:
 *
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 *
 */
public class LeetCode503 {

    public static void main(String[] args) {
        LeetCode503 leetCode503=new LeetCode503();
        int[] nums={100,1,11,1,120,111,123,1,-1,-100};
        int[] nums1=leetCode503.nextGreaterElements(nums);
        for (int i=0;i<nums1.length;i++)
        {
            System.out.println(nums1[i]);
        }

    }

    public int[] nextGreaterElements(int[] nums) {
         if(nums==null)
         {
             return null;
         }

         int[] nums1=new int[nums.length];
         for (int i=0;i<nums.length;i++)
         {
             int temp=0;
             for (int j=i+1;j<nums.length;j++)
             {
                  temp=nums[j];
                  if (nums[i]<temp)
                  {
                     break;
                  }
             }
             if (nums[i]<temp && temp!=0)
             {
                 nums1[i]=temp;
             }else {
                 for (int j=0;j<i;j++)
                 {
                     temp=nums[j];
                     if (nums[i]<temp)
                     {
                         break;
                     }
                 }
             }
             if (nums[i]<temp && temp!=0)
             {
                 nums1[i]=temp;
             }else
             {
                 nums1[i]=-1;
             }
         }
         return nums1;
    }

}
