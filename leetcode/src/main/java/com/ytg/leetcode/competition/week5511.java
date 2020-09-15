package com.ytg.leetcode.competition;

import org.junit.jupiter.api.Test;

public class week5511 {

    @Test
    public void say()
    {
        int[][] mat={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(mat));
    }

    public int numSpecial(int[][] mat) {
       if(mat==null)
       {
           return 0;
       }
       int count=0;
       return count;
    }

    public int numSpecial1(int[][] mat) {
      if (mat==null)
      {
          return 0;
      }
        int ans=0;
      int[] row=new int[mat.length];
      int[] cow=new int[mat[0].length];
      for (int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              row[i]=row[i]+mat[i][j];
              cow[j]=cow[j]+mat[i][j];
          }
      }
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[0].length;j++)
            {
                if (mat[i][j]==1 && row[i]==1 && cow[j]==1)
                {
                    ans=ans+1;
                }
            }
        }
        return ans;
    }

}
