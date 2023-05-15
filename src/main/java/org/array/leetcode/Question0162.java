package org.array.leetcode;

public class Question0162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        int i=0;
        while (i<nums.length){
            if(i==0 && nums[i]>nums[i+1])
                break;
            if(i!=0 && i!=nums.length-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1])
                break;
            if(i==nums.length-1 && nums[i]>nums[i-1])
                break;
            i++;
        }
        return i;
    }
}
