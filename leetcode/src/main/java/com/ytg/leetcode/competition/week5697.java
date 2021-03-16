package com.ytg.leetcode.competition;

public class week5697 {

    public static void main(String[] args) {
        week5697 week56971=new week5697();
        System.out.println(week56971.checkOnesSegment("10"));
    }

    public boolean checkOnesSegment(String s) {
        return false;
    }

    public int countBinarySubstrings(String s) {
        int ones = 0, zeros = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if(i == 0)
                if(s.charAt(i) == '0')
                    zeros++;
                else
                    ones++;
            else{
                if(s.charAt(i) == '0'){
                    zeros = s.charAt(i-1) == '0' ? zeros+1 : 1;
                    if(zeros <= ones)
                        res++;
                }
                else{
                    ones = s.charAt(i-1) == '1' ? ones+1: 1;
                    if(ones <= zeros)
                        res++;
                }
            }
        }
        return res;
    }

}
