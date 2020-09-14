package com.ytg.leetcode.leetcode1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class leetcode79 {

    @Test
    public void say()
    {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(exist(board,word));
    }

    public boolean exist(char[][] board, String word) {
       if (board==null || word==null)
       {
           return false;
       }
       boolean flag=false;
       for (int i=0;i<board.length;i++)
       {
           for (int j=0;j<board[0].length;j++)
           {
               if (board[i][j]==word.charAt(0)){
                   flag=dsf(i,j,board,0,word,0);
               }
           }
       }
       return flag;
    }

    public boolean dsf(int i,int j,char[][] board,int num,String word,int k)
    {
        if (k >= word.length()) {
            return true;
        }
        if (i<0 || i>=board.length || j<0 || j>=board[0].length)
        {
            return false;
        }
        if (board[i][j]==word.charAt(num)){
            return dsf(i-1,j,board,num+1,word,k+1)||dsf(i+1,j,board,num+1,word,k+1)||dsf(i,j-1,board,num+1,word,k+1)||dsf(i,j+1,board,num+1,word,k+1);
        }
        return false;
    }

}
