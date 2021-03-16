package com.ytg.leetcode.competition;

public class week5682 {

    public static void main(String[] args) {
        week5682 week56821=new week5682();
        week56821.beautySum("aab");
    }

    public int beautySum(String s) {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String str=s.substring(i,i+j);
                int[] a=new int[200];
                for (char c : str.toCharArray())
                {
                    a[c]++;
                }
                int max=0;
                int min=1;
                for (int b : a)
                {
                    max=Math.max(max,b);
                    min=Math.min(min,b);
                }
            }
        }
        return 0;
    }

}


