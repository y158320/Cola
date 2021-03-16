package com.ytg.leetcode.competition;

public class week5681 {

    public static void main(String[] args) {
        week5681 week56811=new week5681();
        week56811.checkPowersOfThree(21);
    }

    public boolean checkPowersOfThree(int n) {
       int i=14;
       while (i>=0)
       {
           if (n>=Math.pow(3,i)){
               n= (int) (n-Math.pow(3,i));
           }
           i=i-1;
       }
       if (n==0)
       {
           return true;
       }else {
           return false;
       }
    }

}
