package com.ytg.leetcode.competition;

import org.junit.jupiter.api.Test;

public class week1 {

    @Test
    public void say()
    {
        int[] arr={10,11,12};
        System.out.println(say1(arr));
    }

    public int say1(int[] arr)
    {
        int n=1;
        int subSum = 0;
        while(n <= arr.length){
            for(int i= 0;i <= arr.length-n;i++)
            {
                for(int j = i;j <= i + n -1;j++ )
                {
                    subSum += arr[j];
                }
            }
            n=n+2;
        }
        return subSum;
    }

    public int sumOddLengthSubarrays(int[] arr) {
       if(arr==null)
       {
           return 0;
       }
       int i=0;
       int count=1;
       int sum=0;
       while (count<=arr.length)
       {
           i=0;
           while (i<=arr.length-count)
           {
               for (int j=i;j<=arr.length-count;j++)
               {
                   sum=sum+arr[j];
               }
               i=i+1;
           }
           count=count+2;
       }
       return sum;
    }

}
