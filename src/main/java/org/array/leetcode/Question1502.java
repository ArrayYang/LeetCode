package org.array.leetcode;

import java.util.Arrays;

public class Question1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int step=arr[1]-arr[0];
        int flag=1;
        int i;
        for(i=2;i<arr.length;i++)
            if(arr[i]-arr[i-1]==step){}
        else flag=0;
        if(flag==1)
            return true;
        else
            return false;
    }
}
