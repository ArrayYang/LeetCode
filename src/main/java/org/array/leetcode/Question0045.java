package org.array.leetcode;

public class Question0045 {
    public int jump(int[] nums) {
        int length=nums.length;
        int end=0;
        int maxPos=0;
        int steps=0;
        for(int i=0;i<length-1;i++){
            maxPos=Math.max(maxPos,nums[i]+i);
            if(i==end){
                end=maxPos;
                steps++;
            }
        }
        return steps;
    }
}
