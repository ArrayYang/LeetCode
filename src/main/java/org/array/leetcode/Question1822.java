package org.array.leetcode;

public class Question1822 {
    public int arraySign(int[] nums) {
        int times=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                times*=-1;
        }
        return(times>0?1:-1);
    }
}
