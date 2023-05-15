package org.array.leetcode;

public class Question0069 {
    public int mySqrt(int x) {
        int low=0,high=x,ans=-1;
        while (low<=high){
            int pivot=low+(high-low)/2;
            if((long)pivot*pivot <= x){
                ans=pivot;
                low=pivot+1;
            }else
                high=pivot-1;
        }
        return ans;
    }
}
