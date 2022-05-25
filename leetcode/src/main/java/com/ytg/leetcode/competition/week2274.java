package com.ytg.leetcode.competition;

import java.util.Arrays;

public class week2274 {

    public int maxConsecutive(int bottom, int top, int[] special) {
        int ans=0;
        int n=special.length;
        Arrays.sort(special);
        ans=Math.max(ans,special[0]-bottom);
        ans=Math.max(ans,top-special[n-1]);
        for(int i=0;i<special.length-1;i++){
            ans=Math.max(special[i+1]-special[i]-1,ans);
        }
        return ans;
    }

}
