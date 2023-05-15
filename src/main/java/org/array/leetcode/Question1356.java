package org.array.leetcode;

import java.util.Arrays;

public class Question1356 {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int t=0;
        int[] time=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            time[i]=Get_Bits(arr[i]);
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if((time[i]>time[j])||((time[i]==time[j])&&(arr[i]>arr[j]))){
                    t=time[i];
                    time[i]=time[j];
                    time[j]=t;
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        return arr;
    }

    private int Get_Bits(int i) {
        int t=0;
        while(i>0){
            t=t+i%2;
            i=i/2;
        }
        return t;
    }
}
