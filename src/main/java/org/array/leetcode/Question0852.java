package org.array.leetcode;

public class Question0852 {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i+1]>arr[i])
                i++;
            else
                break;
        }
        return i;
    }
}
